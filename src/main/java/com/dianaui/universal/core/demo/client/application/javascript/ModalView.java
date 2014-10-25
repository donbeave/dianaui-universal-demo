/*
 * #%L
 * Diana UI Core
 * %%
 * Copyright (C) 2014 Diana UI
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.dianaui.universal.core.demo.client.application.javascript;

import com.dianaui.universal.core.client.ui.Button;
import com.dianaui.universal.core.client.ui.Modal;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * @author Joshua Godi
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
public class ModalView extends ViewImpl implements ModalPresenter.MyView {

    interface Binder extends UiBinder<Widget, ModalView> {
    }

    @UiField
    Modal basicModal;

    @UiField
    Button basicButton;

    @UiField
    Button basicCloseButton;

    @UiField
    Button customHeaderButton;

    @UiField
    Modal modalWithCustomHeader;

    @UiField
    Modal modalWithoutBackdrop;

    @UiField
    Button withoutBackdropShowBtn;

    @UiField
    Button withoutBackdropHideBtn;

    @UiField
    Modal modal1;

    @UiField
    Modal modal2;

    @UiField
    Modal modal3;

    @UiField
    Button modal1Button;

    @UiField
    Button modal2Button;

    @UiField
    Button modal3Button;

    @Inject
    ModalView(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("basicButton")
    void onModalButtonClicked(ClickEvent event) {
        basicModal.show();
    }

    @UiHandler("basicCloseButton")
    void onCloseButtonClicked(ClickEvent event) {
        basicModal.hide();
    }

    @UiHandler("customHeaderButton")
    void onCustomHeaderButtonClicked(ClickEvent event) {
        modalWithCustomHeader.show();
    }

    @UiHandler("withoutBackdropShowBtn")
    void onWithoutBackdropShowBtnClicked(ClickEvent event) {
        modalWithoutBackdrop.show();
    }

    @UiHandler("withoutBackdropHideBtn")
    void onWithoutBackdropHideBtnClicked(ClickEvent event) {
        modalWithoutBackdrop.hide();
    }

    @UiHandler("modal1Button")
    void onModal1ButtonClicked(ClickEvent event) {
        modal1.show();
    }

    @UiHandler("modal2Button")
    void onModal2ButtonClicked(ClickEvent event) {
        modal2.show();
    }

    @UiHandler("modal3Button")
    void onModal3ButtonClicked(ClickEvent event) {
        modal3.show();
    }

}
