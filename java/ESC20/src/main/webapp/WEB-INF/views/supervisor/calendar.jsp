<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ page
language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
    <head>
        <title data-localize="headTitle.calendar"></title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="/<%=request.getContextPath().split("/")[1]%>/css/fullcalendar.min.css" />
        <%@ include file="../commons/header.jsp"%>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <%@ include file="../commons/bar.jsp"%>
			
            <main class="content-wrapper">
                    <section class="content">
                            <h2 class="clearfix section-title">
                                <span data-localize="title.calendar"></span>
                            </h2>
                            <div class="container-fluid">
                                
                                <div class="content-white">
                                        <div class="container-fluid"><div id="calendar"></div></div>
                                    
                                </div>
                            </div>
                        </section>
            </main>
        </div>
        <%@ include file="../modal/eventModal.jsp"%>
        <%@ include file="../modal/eventModalStatic.jsp"%>
        <%@ include file="../commons/footer.jsp"%>
    </body>
    <script>
        var leaveList = eval(${leavesCalendar});
        var leaveTypes = eval(${leaveTypes});
        var absRsns = eval(${absRsns});
        $(document).ready(function() {
            console.log(initialLocaleCode)
            initThemeChooser({
                init: function(themeSystem) {
                    $('#calendar').fullCalendar({
                        themeSystem: themeSystem,
                        header: {
                            left: 'prev,next today',
                            center: 'title',
                            right: 'month'
                            // right: 'month,agendaWeek,agendaDay,listMonth'
                        },
                        buttonText: {
                            today: 'Today',
                            month: 'Month'
                        },
                        timeFormat: 'hh:mm A',
                        defaultDate: new Date(),
                        weekNumbers: false,
                        navLinks: true, // can click day/week names to navigate views
                        editable: false,
                        eventLimit: true, // allow "more" link when too many events
                        events: leaveList,
                        locale: initialLocaleCode,
                        eventClick: function(calEvent, jsEvent, view) {
                            console.log(calEvent)
                          let leaveRequest = calEvent;
                          console.log(leaveRequest)
                          let type
                          leaveTypes.forEach(element => {
                              if(element.code == leaveRequest.LeaveType){
                                  type = element.description
                              }
                          });
                          let reason
                          absRsns.forEach(element => {
                              if(element.code == leaveRequest.AbsenseReason){
                                  reason = element.description
                              }
                          });
                          let leaveStartDate = leaveRequest.start._i
                          let leaveEndDate = leaveRequest.end._i

                          let start_arry = leaveStartDate.split(" ")
                          let end_arry = leaveEndDate.split(" ")

                          let startTime = changeFormatTimeAm(start_arry[1])
                          let endTime = changeFormatTimeAm(end_arry[1])

                          let startDate = changeMMDDFormat(start_arry[0])
                          let endDate = changeMMDDFormat(end_arry[0])

                          let start = startDate + " " + startTime
                          let end = endDate + " " +endTime

                          // $("#leaveIdStatic").attr("value", leaveRequest.id+"");
                          $("#disIdStatic").attr("value", leaveRequest.id+"");
                          $("#appIdStatic").attr("value", leaveRequest.id+"");
                          $("#employeeStatic").text(leaveRequest.lastName)
                          $("#startDateStatic").html(start)
                          $("#endDateStatic").html(end)
                          $("#leaveTypeStatic").html(type)
                          $("#absenceReasonStatic").html(reason)
                          $("#leaveRequestedStatic").html(leaveRequest.lvUnitsUsed)
                          $("#commentLogStatic").html("")
                          $("#leaveStatusStatic").text(leaveRequest.statusDescr)
                          $("#leaveApproverStatic").text(leaveRequest.approver)
                          let comments = leaveRequest.comments
                          for(let i=0;i<comments.length;i++){
                                  let html = '<p>'+comments[i].detail+'</p>'
                                  $("#commentLogStatic").append(html)
                          }
                          $("infoEmpNameStatic").html(leaveRequest.empNbr + ":" +leaveRequest.firstName+ ","+leaveRequest.firstName)
                          $("#infoDetailStatic").html("")
                          $('#EventDetailModal').modal('show')
                          initLocalize(initialLocaleCode)
                        },
                        viewRender:function(){
                            $(".fc-event").attr("tabindex",0)
                            $(".fc-event").keypress(function(e){
                                console.log(e)
                                var eCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
                                if (eCode == 13){
                                    $(this).click()
                                }
                            })
                        }
                    })
                },

            })
        })
        function changeMMDDFormat(date){
          let dateArry = date.split("-")
          return dateArry[1]+"/"+dateArry[2]+"/"+dateArry[0]
        }
        function changeFormatTimeAm(value){
          let array = value.split(/[,: ]/);
          let hour,minute,time
          hour = parseInt(array[0])
          minute = array[1]

          if(hour>12){
            hour = (hour-12) < 10 ? "0" + (hour-12) : hour-12;
            time = hour+ ":" +minute+" PM"
          }else{
            if(hour==12){
              time = hour+ ":" +minute+" PM"
            }else{
              hour = hour < 10 ? "0" + hour : hour;
              time = hour+ ":" +minute+" AM"
            }

          }
          return time
      }
</script>
</html>
