<#-- @ftlvariable name="" type="com.alexeypro.samples.views.SayingView" -->
<html>
    <body>
        <!-- calls getSaying().getContent() and sanitizes it -->
        <h1>${saying.content?html}!</h1>
    </body>
</html>