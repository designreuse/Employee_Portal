
var calUnit
var mealBreakHours,standardHoursDaily,leaveHoursRequestedEntry,conversionMinuteHour
$(function() {
    $('#deleteLeave').hide()
    showTimeUnit()
    mealBreakHours = $("#mealBreakHours").val()
    standardHoursDaily = $("#standardHoursDaily").val()
    leaveHoursRequestedEntry = $("#requireLeaveHoursRequestedEntry").val()
    standardHoursDaily = Number(standardHoursDaily)
    mealBreakHours = Number(mealBreakHours)
    
    formValidator()
    var checkin = $('#startDate')
        .fdatepicker({
            // startDate: now,
            format: 'mm-dd-yyyy',
            language:initialLocaleCode,
            weekStart:7
        })
        .on('changeDate', function(ev) {
            var endDate = $('#endDateInput').val()
            var startDate = $('#startDateInput').val()

            if (
                ev.date &&
                !endDate
            ) {
                var dateArray = startDate.split('-')
                startDate = new Date(dateArray[2]+'/'+dateArray[0]+'/'+dateArray[1]+' 12:00:00')
                
                startDate.setDate(startDate.getDate())
                // startDate.setMonth(startDate.getMonth() -1)
                checkout.update(startDate)
                $('#endDateInput').change()
                $('#startDateInput').change()
                calcTime()
            }
            // if(ev.date){
            //     $(".dateTimePeriodOverlap").hide()
			//     $(".dateTimePeriodOverlapWrap").removeClass('has-error')
            // }
        })
        .data('datepicker')
    var checkout = $('#endDate')
        .fdatepicker({
            // startDate: now,
            format: 'mm-dd-yyyy',
            language:initialLocaleCode,
            weekStart:7,
            onRender: function(date) {
                return date.valueOf() < checkin.date.valueOf()
                    ? 'disabled'
                    : ''
            }
        })
        .on('changeDate', function(ev) {
            //$('#startDateNote').val(startNote)
            //$('#endDateNote').val(endNote)
            calcTime()
        })
        .data('datepicker')

        $("input").bind('keypress', function(e)  {
            var eCode = e.keyCode
                ? e.keyCode
                : e.which
                ? e.which
                : e.charCode
            if (eCode == 13) {
                $(this).click()
                event.preventDefault();
            }
        })
        $("#startDateInput").blur(function(){
            var fromValue = convertRightFormat($("#startDateInput").val())
            var toValue = convertRightFormat($("#endDateInput").val())
            var leaveFrom = fromValue?changeDateYMD(fromValue):null
            var leaveTo = toValue?changeDateYMD(toValue):null
            if(fromValue && toValue){
                if( leaveFrom<=leaveTo){
                    $('.dateValidator01').hide()
                    calcDays()
                }else{
                    $('.dateValidator01').show()
                    setTimeout(function(){
                        $("#endDateInput").val('')
                    },500)
                }
            }
            
        });
        
        $("#endDateInput").blur(function(){
        var fromValue = convertRightFormat($("#startDateInput").val())
        var toValue = convertRightFormat($("#endDateInput").val())
        var leaveFrom = changeDateYMD(fromValue)
        var leaveTo = changeDateYMD(toValue)
        if(fromValue && toValue){
                if( leaveFrom<=leaveTo){
                    $('.dateValidator01').hide()
                }else{
                    $('.dateValidator01').show()
                    setTimeout(function(){
                        $("#startDateInput").val('')
                    },500)
                }
                calcDays()
            }
            
        });
    
        $("#leaveHoursDaily").blur(function(){
            var val = $(this).val()
            $(this).val(Number(val).toFixed(3))
            calcDaysOrHours()
        });
        $(".requestModalBtn .btn").focus(function(){
            $(".submitClose").removeClass('highlight')
        })
})
function changeLeaveType(){
    var leaveType = $("#modalLeaveType").val()
    $("#absenceReason").html('')

    if(leaveType != ''){
        var reason = leaveTypesAbsrsnsMap.filter(function(item){
            return item.leaveType == leaveType
        })
        if(reason.length>1){
        	$("#absenceReason").append("<option value=\"\" data-label=\"\">&nbsp;</option>");
        }
        reason.forEach(function(item){
            $("#absenceReason").append("<option value='"+item.absRsn +"'>" + item.absRsnDescrption +"</option>")
        })
    }else{
        var reasonJson = new Array()
        leaveTypesAbsrsnsMap.forEach(function(item){
            var count = 0
            if(item.absRsnDescrption){
                for(var i=0,len = reasonJson.length;i<len;i++){
                    if(item.absRsn == reasonJson[i].absRsn){
                        count++
                    }
                }
                if(count == 0){
                    reasonJson.push(item)
                }
                
            }
        })
        reasonJson.forEach(function(item){
            $("#absenceReason").append("<option value='"+item.absRsn +"'>" + item.absRsnDescrption +"</option>")
        })
        calUnit = false
    }
    showTimeUnit()
    $("#absenceReason").change()
}

function changeFormatTime(value) {
    var array = value.split(/[,: ]/)
    if (array[2] == 'PM') {
        var h
        if (array[0] == 12) {
            h = array[0]
        } else {
            h = parseInt(array[0]) + 12
        }
        return h + ':' + array[1]
    } else {
        var h
        if (array[0] == 12) {
            h = h = parseInt(array[0]) - 12
            return h + ':' + array[1]
        }
        return array[0] + ':' + array[1]
    }
}

function deleteRequest() {
    var id = $('#leaveId').val()
    $("#deleteId").val(id);
    $("#deleteModal").modal("show")
}
function closeRequestForm() {
    $(".timeControlStart").removeClass('has-error')
    $(".timeControlEnd").removeClass('has-error')
    $(".sameTimeError").hide()
    $('#requestForm')
        .data('bootstrapValidator')
        .destroy()
    $('#requestForm').data('bootstrapValidator', null)
    formValidator()
    leaveId = null
    $(".submitClose").addClass('highlight')
}
function formValidator() {
    $('#requestForm').bootstrapValidator({
        live: 'disabled',
        trigger:null,
        excluded:[":disabled"],
        feedbackIcons: {
            valid: 'fa fa-check ',
            validating: 'fa fa-refresh'
        },
        fields: {
            leaveType:{
                validators: {
                    notEmpty: {
                        message: selectLeaveTypeValidator
                    },
                }
            },
            absenseReason:{
                validators: {
                    notEmpty: {
                        message: selectAbsenceReasonValidator
                    },
                }
            },
            LeaveStartDate: {
                trigger:'change',
                validators: {
                    notEmpty: {
                        message: startDateCannotBeEmptyValidator
                    }
                }
            },
            LeaveEndDate: {
                trigger:'change',
                validators: {
                    notEmpty: {
                        message: endDateCannotBeEmptyValidator
                    }
                }
            },
            startHour: {
                validators: {
                    notEmpty: {
                        message: enterAStartHour
                    }
                }
            },
            endHour: {
                validators: {
                    notEmpty: {
                        message: enterAnEndHour
                    }
                }
            },
            startMinute: {
                validators: {
                    notEmpty: {
                        message: enterAStartMinute
                    }
                }
            },
            endMinute: {
                validators: {
                    notEmpty: {
                        message: enterAnEndMinute
                    }
                }
            },
            startTimeValue: {
                trigger:'change',
                validators: {
                    callback: {
                        message: startAndEndBeDifferent,
                        callback: function(value, validator) {
                            var flag = true;
                            console.log(value)
                            flag = compareTime('endTimeValue')
                            if(flag){
                                validator.updateStatus('endTimeValue', 'VALID');
                            }
                            return flag;
                        }
                    }
                }
            },
            endTimeValue: {
                trigger:'change',
                validators: {
                    callback: {
                        message: startAndEndBeDifferent,
                        callback: function(value, validator) {
                            var flag = false;
                            console.log(value)
                            flag = compareTime('startTimeValue')
                            if(flag){
                                validator.updateStatus('startTimeValue', 'VALID');
                            }
                            return flag;
                        }
                    }
                }
            },
            lvUnitsDaily:{
                validators: {
                    // trigger:"change",
                    greaterThan: {
                        value : 0.001,
                        message : enterNonZeroValueValidator
                    }
                }
            },
            Remarks: {
                validators: {
                     notEmpty: {
                         message: remarksCannotBeEmptyValidator
                     }
                }
            }
        }
    })
    // setGlobal()
}

var timeError = false
function calcTime(){
    $('#requestForm').bootstrapValidator('disableSubmitButtons', false);  
    var startH = $("#startHour").val()
    var startM = $("#startMinute").val()
    if(startM === ''){
        $("#startMinute").val('00');
        startM='00';
    }
    var startTo = $("#startAmOrPm").val()
    var startTime = startH&&startM&&startTo?changeFormatTime(startH+":"+startM+" "+startTo):null
    var endH = $("#endHour").val()
    var endM = $("#endMinute").val()
    if(endM === ''){
        $("#endMinute").val('00');
        startM='00';
    }
    var endTo = $("#endAmOrPm").val()
    var endTime = endH&&endM&&endTo?changeFormatTime(endH+":"+endM+" "+endTo):null
    var start = startTime?new Date("2000/01/01 " + startTime):null;
    var end = endTime?new Date("2000/01/01 " + endTime):null;
    var time = end&&start?(end.getTime()-start.getTime()):0
    var hours = time/(3600*1000)
    if(hours>0){
        timeError = false
        // if()
        hours = Number(hours).toFixed(3)
    }else{
        timeError = true
        hours = Number(0) .toFixed(3)
    }
    if(leaveHoursRequestedEntry == 'false'&&end&&start){
        hours = hours > 5 ? hours - mealBreakHours:hours
        $('#leaveHoursDaily').val(Number(hours).toFixed(3)).change()
        if(Number(hours).toFixed(3) > 0){
            console.log("tet")
            updateStatusDaily()
        }
        
    }
    
    calcDays()
    calValueTime()
}
function calcDays(){
    calcDaysOrHours()
}

function calValueTime(){
    var start = $("#startHour").val() + ":" + $("#startMinute").val() + " " + $("#startAmOrPm").val()
    var end = $("#endHour").val() + ":" + $("#endMinute").val() + " " + $("#endAmOrPm").val()
    console.log(start)
    $("#startTimeValue").val(start).change()
    $("#endTimeValue").val(end).change()
}

function isHourKey(keyPressEvent) {
    var charCode = (keyPressEvent.which) ? keyPressEvent.which : keyPressEvent.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {  // the character entered must be a number
        return false;
    } else if (charCode <= 31) {
        return true;
    }
    
    
    var value = $(keyPressEvent.target).val().trim();
    var valueLength = value.length;
    var selStart = keyPressEvent.target.selectionStart;
    var selEnd = keyPressEvent.target.selectionEnd;
    var selLength = keyPressEvent.target.selectionEnd - keyPressEvent.target.selectionStart;
    if (value.length>0 && selLength<value.length) {
        if (selStart==0) {
            if (charCode!=48) { // if the character entered is not a zero
                if (charCode==49) {  // if the character entered is the number one
                    var secondCharCode;
                    if (value.length==1) {
                        secondCharCode = value.charCodeAt(0);
                    } else {
                        secondCharCode = value.charCodeAt(1);
                    }
                    
                    if (secondCharCode!=48 && secondCharCode!=49 && secondCharCode!=50) {
                        return false;
                    }
                } else {					
                    return false;
                }
            }
        } else if (selStart==1) {
            var firstCharCode = value.charCodeAt(0);
            if (firstCharCode==48) { // if the first character is a zero
                if (charCode==48) {  // then do not accept a second zero
                    return false;
                }
            } else if (firstCharCode==49) {  // if the first character is a one
                if (charCode!=48 && charCode!=49 && charCode!=50) {  // then the second char can only be 0, 1, or 2
                    return false;
                }
            } else {  // the first character is a number between 2 and 9 ... no character is valid as the second char
                return false;
            }
        } else {
            return false;
        }
    }
    return true;
} 

function isMinuteKey(keyPressEvent) {
    // in theory, a keyPress event should only get fired for printable characters although this is not always the case.
    // firefox, for example, will generate a keyPress event for the tab key (charCode=9).
    // return true for non-printable characters less than 31 which would include the tab key
    var charCode = (keyPressEvent.which) ? keyPressEvent.which : keyPressEvent.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {  // the character entered must be a number
        return false;
    } else if (charCode <= 31) {
        return true;
    }

    var value = $(keyPressEvent.target).val().trim();
    var valueLength = value.length;
    var selStart = keyPressEvent.target.selectionStart;
    var selEnd = keyPressEvent.target.selectionEnd;
    var selLength = keyPressEvent.target.selectionEnd - keyPressEvent.target.selectionStart;
    if (value.length>0 && selLength<value.length) {
        if (selStart==0) {
            if (charCode>53) { // the first character may not be greater than five
                return false;
            }
        } else if (selStart==1) {
            var firstCharCode = value.charCodeAt(0);
            if (firstCharCode>53) {  // the first character is a number greater than 5 ... no character is valid as the second char
                return false;
            }
        } else {
            return false;
        }
    }
    return true;
}

function changeDateYMD(date,notFormat){
    if(!date){
        return
    }
    var dateArry = date.split("-")
    if(notFormat){
        return dateArry[2]+"-"+dateArry[0]+"-"+dateArry[1]
    }else{
        var DateFormat = new Date(dateArry[2]+"-"+dateArry[0]+"-"+dateArry[1])
        return DateFormat
    }
    
}

function convertRightFormat(str){
    var reg = /^[0-9]{1,2}[^\d]{1}[0-9]{1,2}[^\d]{1}[0-9]{4}$/;
    var regStr = /^[0-9]{1,2}[0-9]{1,2}[0-9]{4}$/;
    if(reg.test(str)||regStr.test(str)){
        if(reg.test(str)){
            return str
        }
        if(regStr.test(str)){
            var pattern = /(\d{2})(\d{2})(\d{4})/;
            var formatedDate = str.replace(pattern, '$1-$2-$3');
            return formatedDate
        }
    }else{
        return false
    }
}
var compareTimeValue = false
function compareTime(name){
    var leaveStartDate = $("#startDateInput").val();
    var leaveEndDate = $("#endDateInput").val();
    var startTimeValue = $("#startTimeValue").val();
    var endTimeValue = $("#endTimeValue").val();

    if(leaveStartDate && leaveStartDate != '' && startTimeValue && startTimeValue!=''){
        var startFullTimeNote = new Date(changeDateYMD(leaveStartDate,true) + ' ' + changeFormatTime(startTimeValue))
    }
    if(leaveEndDate && leaveEndDate != '' && endTimeValue && endTimeValue!=''){
        var endFullTimeNote = (new Date(changeDateYMD(leaveEndDate,true) + ' ' + changeFormatTime(endTimeValue))).getTime()
    }
    console.log(startFullTimeNote.valueOf())
    console.log(endFullTimeNote.valueOf())
    if(startFullTimeNote && endFullTimeNote){
        if(startFullTimeNote.valueOf() == endFullTimeNote.valueOf()){
            compareTimeValue = false
            return false
        }else{
            if(!compareTimeValue){
                compareTimeValue = true
                // $("#requestForm").data('bootstrapValidator').updateStatus(name, 'callback').validateField(name);
            }
            return true
        }
    }
}

function saveRequest(isAdd){
    if(isAdd){
        $("#isAdd").val(isAdd)
    }
    $(event.currentTarget).parents(".modal").focus()

    var dateTotal = $("#totalRequested").val()
    var typeCode = $("#modalLeaveType").val()
    var balanceAvailable = $("#available"+typeCode+"").text()
    var postAgnstZeroBal = $("#postAgnstZeroBal"+typeCode+"").text()

    var leaveStartDate = $("#startDateInput").val();
    var leaveEndDate = $("#endDateInput").val();
    var startTimeValue = $("#startTimeValue").val();
    var endTimeValue = $("#endTimeValue").val();
    var empNbr = $("#empNbrModal").val();


    var bootstrapValidator = $('#requestForm').data('bootstrapValidator')
    bootstrapValidator.validate()
    if (bootstrapValidator.isValid()) {
        var leaveHoursDaily = $("#leaveHoursDaily").val()
        if(Number(leaveHoursDaily) == 0){
            $(".leaveHoursDailyNotZero").show()
            $(".leaveHoursDailyWrap").addClass('has-error')
            return false
        }
        $(".leaveHoursDailyNotZero").hide()
        $(".leaveHoursDailyWrap").removeClass('has-error')
        
        if (timeError) {
            $('.dateValidator').show()
            $("#endHour").focus()
            return false
        } else {
            $('.dateValidator').hide()
            if(parseFloat(dateTotal)>0){
                $(".dateValidator01").hide()
                
                if(parseFloat(dateTotal)<=parseFloat(balanceAvailable) ||
                   postAgnstZeroBal == 'Y'){
                    $(".availableError").hide()
                    // return false
                    var obj = { 
                        'leaveStartDate': leaveStartDate,
                        'leaveEndDate':leaveEndDate,
                        'startTimeValue':startTimeValue,
                        'endTimeValue':endTimeValue,
                        'empNbr': empNbr,
                        'leaveId':leaveId?leaveId:0
                    }
                    $.ajax({
                        type: "POST", 
                        url: urlMain +"/leaveRequest/validateLeaveRequestCommand", 
                        data: JSON.stringify(obj), // this creates formatted JSON string for ajax post to asmx service
                        dataType: "json",
                    	cache: false,
                    	contentType: "application/json; charset=utf-8",
                    	success: function (result) {
                            console.log(result);
                            if(result.sucess){
                                    $(".dateTimePeriodOverlap").hide()
                                    $(".dateTimePeriodOverlapWrap").removeClass('has-error')
                                    console.log("submit...")
                                    // return false
                                    $('#requestForm')[0].submit()
                            }else{
                                $(".dateTimePeriodOverlap").show()
                                $(".dateTimePeriodOverlapWrap").addClass('has-error')
                            }
                        },
                        error:function(res){
                            console.log(res)
                        }
			        })	
                    
                   
                }else{
                    $(".availableError").show()
                }
            }else{
                $(".dateValidator01").show()
            }
            
        }
    } else return
}
function showTimeUnit(){
    var leaveTypeCurrent = $("#modalLeaveType option:selected").data('label')
    if(!leaveTypeCurrent){
        $(".timeUnit").hide()
    }else{
        var ConversionRecsUrl = ''
        if(leaveTypeCurrent.toLowerCase() == 'h'){
            $(".timeUnit.hours").show()
            $(".timeUnit.days").hide()
            calUnit = 'h'
            ConversionRecsUrl = '/getMinutesToHoursConversionRecs'
        }else{
            $(".timeUnit.days").show()
            $(".timeUnit.hours").hide()
            calUnit = 'd'
            ConversionRecsUrl = '/getHoursToDaysConversionRecs'
        }
        var leaveType = $("#modalLeaveType").val()
        var freq = $("#freq").val()
        $.ajax({
            type:'POST',
            url:urlMain + '/leaveRequest' + ConversionRecsUrl,
            data:{
                payFrequency:freq?freq.trim():'',
                leaveType:leaveType.trim()
            },
            success : function (res) {
                console.log(res)
                conversionMinuteHour = res
                calcDaysOrHours()
            },
            error:function(res){
                console.log(res);
            }
        })
    }
}

function calcDaysOrHours(){
    var startDate = changeDateYMD($('#startDateInput').val())
    var endDate = changeDateYMD($('#endDateInput').val())

    var leaveHoursDaily = Number($('#leaveHoursDaily').val().trim())
    var day1 = startDate;
    var day2 = endDate;
    var dayDate = ((day2 - day1) / (1000 * 60 * 60 * 24));
    console.log(dayDate)
    dayDate += 1
    console.log(dayDate)
    var totalDays = 0
    dayDate = dayDate?dayDate:0;
    if(leaveHoursDaily <= 0){
        $("#totalRequested").val(Number(0).toFixed(3));
    }

    if(leaveHoursDaily > 0){
        if(calUnit){
            if(calUnit.toLowerCase() == 'd'){
                var intDays = parseInt(leaveHoursDaily/standardHoursDaily)
                var intDaysRemainHours = parseFloat(leaveHoursDaily%standardHoursDaily)
                var floatDays = 0
                if(conversionMinuteHour && conversionMinuteHour.length>0){
                    for(var i = 0,len = conversionMinuteHour.length;i<len;i++){
                        if(intDaysRemainHours >0 && intDaysRemainHours <= conversionMinuteHour[i].toUnit){
                            floatDays = conversionMinuteHour[i].fractionalAmount
                            break;
                        }
                    }
                }else{
                    var cal01 = parseFloat(leaveHoursDaily/standardHoursDaily) //0.465
                    var cal02 = parseInt(leaveHoursDaily/standardHoursDaily)
                    if(cal01 - cal02 > 0){
                        floatDays = cal01 - cal02<=0.5?0.5:1
                    }
                }
                
                totalDays = (intDays + floatDays) * dayDate
                if(Number(totalDays).toFixed(3)>=0){
                    $("#totalRequested").val(Number(totalDays).toFixed(3));
                }else{
                    $("#totalRequested").val(Number(0).toFixed(3));
                }
                
            }else if(calUnit.toLowerCase() == 'h'){
                if(leaveHoursRequestedEntry == 'false'){
                    var intHours = parseInt(leaveHoursDaily)
                    var intHoursRemainMinutes = (leaveHoursDaily - intHours) * 60
                    var floatHours = leaveHoursDaily - intHours
                    if(conversionMinuteHour && conversionMinuteHour.length>0){
                        for(var i = 0,len = conversionMinuteHour.length;i<len;i++){
                            if(intHoursRemainMinutes >0 && intHoursRemainMinutes <= conversionMinuteHour[i].toUnit){
                                floatHours = conversionMinuteHour[i].fractionalAmount
                                break;
                            }
                        }
                    }
                    $('#leaveHoursDaily').val(Number(floatHours + intHours).toFixed(3))
                    $('#leaveHoursDaily').change()
                    if(Number(floatHours + intHours).toFixed(3) > 0){
                        updateStatusDaily()
                    }
                    var totalHours = dayDate>=0?(floatHours + intHours) * dayDate:0
                    $("#totalRequested").val(Number(totalHours).toFixed(3));
                }else{
                    var totalHours = dayDate>=0?leaveHoursDaily * dayDate:0
                    $("#totalRequested").val(Number(totalHours).toFixed(3));
                }                
            }
        }
    }
        
}

function updateStatusDaily(){
    $("#requestForm").data('bootstrapValidator').updateStatus('lvUnitsDaily', 'greaterThan').validateField('lvUnitsDaily');
}