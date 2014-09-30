<%@ page import="org.multiple.domain.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="book.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${bookInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'rate', 'error')} required">
	<label for="rate">
		<g:message code="book.rate.label" default="Rate" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rate" type="number" value="${bookInstance.rate}" required=""/>
</div>

