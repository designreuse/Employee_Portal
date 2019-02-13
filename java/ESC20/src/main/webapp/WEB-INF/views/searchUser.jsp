<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> <%@ page
language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <title data-localize="headTitle.createNewUser"></title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <%@ include file="commons/header.jsp"%>
    </head>
    <body class="account-wrap">
        <%@ include file="commons/bar-account.jsp"%>
        <div class="account-top">
                <div class="account-inner sm">
                        <form id="retrieveUser" action="retrieveUser" method="post">
                                <div class="form-group">
                                        <input type="hidden" name="id" value="${id}">
                                        <label class="form-title" for="autoAdvance_1"><span data-localize="label.employeeNumber"></span>(<span data-localize="label.noDashes"></span>)</label>
                                        <div class="valid-wrap">
                                            <input type="text" id="autoAdvance_1" class="form-control autoAdvance" placeholder="" name="empNumber" maxlength="6">
                                        </div>
                                    </div>
                                    <div class="m-b-10">
                                        <label class="form-title"><span data-localize="label.dateOfBirth"></span>	(<span data-localize="label.mmddyyyy"></span>)</label>
                                        <div class="valid-wrap inline">
                                                <div class="form-group">
                                            <input type="text" id="autoAdvance_2" class="form-control autoAdvance" placeholder="" title="" name="dateMonth" data-localize="label.month" maxlength="2">
                                        </div>
                                            <div class="form-group">
                                            <input type="text" id="autoAdvance_3" class="form-control autoAdvance" placeholder="" title="" name="dateDay" data-localize="label.day" maxlength="2">
                                        </div>
                                            <div class="form-group">
                                            <input type="text" id="autoAdvance_4" class="form-control autoAdvance" placeholder="" title="" name="dateYear" data-localize="label.year" maxlength="4">
                                        </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                            <input type="hidden" name="id" value="${id}">
                                            <label class="form-title" data-localize="label.zipCode" for="autoAdvance_5"></label>
                                            <div class="valid-wrap">
                                                <input type="text" id="autoAdvance_5" class="form-control autoAdvance" placeholder="" name="zipCode" maxlength="5">
                                            </div>
                                        </div>
                                        <div class="form-group account-btn">
                                            <button type="submit" class="btn btn-primary" data-localize="label.retrieve"></button>
                                        </div>
                               
                            </form>
                </div>
            </div>
    </body>
    <script>
            $('#retrieveUser').bootstrapValidator({
                live: 'enable',
                trigger: 'blur keyup',
                feedbackIcons: {
                    valid: 'fa fa-check ',
                    validating: 'fa fa-refresh'
                },
                fields: {
                    empNumber: {
                        validators: {
                            notEmpty: {
                                    message: 'validator.requiredField'
                                },
                                regexp: {
                                    regexp: /^[0-9]\d{5}$/,
                                    message: 'validator.pleaseEnterCorrectFormat'
                                }
                        }
                    },
                    dateMonth: {
                        validators: {
                            notEmpty: {
                                    message: 'validator.requiredField'
                                },
                                regexp: {
                                    regexp: /^[0-1]\d{0,1}$/,
                                    message: 'validator.pleaseEnterCorrectFormat'
                                }
                        }
                    },
                    dateDay: {
                        validators: {
                            notEmpty: {
                                    message: 'validator.requiredField'
                                },
                                regexp: {
                                    regexp: /^[0-3]\d{0,1}$/,
                                    message: 'validator.pleaseEnterCorrectFormat'
                                }
                        }
                    },
                    dateYear: {
                        validators: {
                            notEmpty: {
                                    message: 'validator.requiredField'
                                },
                                regexp: {
                                    regexp: /^[0-9]\d{3}$/,
                                    message: 'validator.pleaseEnterCorrectFormat'
                                }
                        }
                    },
                    zipCode: {
                        validators: {
                            notEmpty: {
                                    message: 'validator.requiredField'
                                },
                                regexp: {
                                    regexp: /^[0-9]\d{4}$/,
                                    message: 'validator.pleaseEnterCorrectFormat'
                                }
                        }
                    }
                }
            })
        </script>

</html>