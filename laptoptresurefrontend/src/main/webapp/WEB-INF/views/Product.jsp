<%@ page language="java" contentType="text/html"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Header.jsp"%>

<form:form action= "InsertProduct" modelAttribute="product">
<table align="center">
                      <tr>
                           <td colspan="1"><center>Product Details</center></td>
                     </tr>
                      
                      <tr>
                          <td>Product ID</td>
                          <td><form:input path="prodid" /></td>
                      </tr>
                      
                      
              <tr>
                  <td>Category</td>
                  <td><form:select path="catid">
                  <form:option value="0" lable="--------Select--------"  />
                  <form:options items="${catlist}" />
                  </form:select>
                  </td>                
             </tr>
              <tr>
                 <td>Price</td>
                 <td><form:input path="price" /></td>
             </tr>
             
             <tr>
                 <td>Product Desc</td>
                 <td><form:textarea path="proddesc" /></td>
             </tr>
             
                     <tr>
                           <td>Product Name</td>
                           <td><form:input path="prodname" /></td>
                           
                      </tr>
             
            
             
             <tr>
                 <td>Quantity</td>
                 <td><form:input path="quantity" /></td>
             </tr>
             
             
             <tr>
                 <td>Supplier</td>
                 <td><form:input path="supid" /></td>
             </tr>
             
             
             <tr>
                  <td colspan="2"><input type="submit" /></td>
             </tr>

</table>
</form:form>

<!-- Displaying the Product data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>Product ID</td>
		<td>Category ID</td>
		<td>Price</td>
		<td>Product Desc</td>
		<td>Product Name</td>
		<td>Quantity</td>
		<td>Supplier ID</td>
		<td>Operation</td>
	</tr>
	      
	<c:forEach items="${prodlist}" var="product">
		<tr bgcolor="cyan">
			<td>${product.prodid}</td>
			<td>${product.prodname}</td>
			<td>${product.proddesc}</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.catid}</td>
			<td>${product.supid}</td>
			
			<td><a href="<c:url value="deleteProduct/${product.prodid}"/>">Delete</a>
				<a href="<c:url value="updateProduct/${product.prodid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->

</body>
</html>
