<div
    class="modal fade"
    id="deleteModal"
    tabindex="-1"
    role="dialog"
    aria-labelledby="deleteModal"
    aria-hidden="true"
    data-backdrop="static"
>
    <div class="modal-dialog approveForm warn-modal" style="max-width:350px;">
        <div class="modal-content text-center">  
            <div class="modal-body text-center">
                <i class="fa fa-exclamation-circle warn-icon"></i>
                <p>${sessionScope.languageJSON.label.areYouDelete}</p>
            </div>
            <div class="modal-footer">
                <button type="button" role="button"  class="btn btn-primary sureDelete">
                	${sessionScope.languageJSON.label.ok}
                </button>
                <button
                    type="button" role="button"
                    class="btn btn-secondary closeModal"
                    data-dismiss="modal"
                >
                	${sessionScope.languageJSON.label.cancel}
                </button>
            </div>
                
                
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>
