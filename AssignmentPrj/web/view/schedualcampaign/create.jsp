<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Schedule Campaign</title>
    </head>
    <body>
        <h2>Create Schedule for Campaign</h2>
        <form action="<c:url value='/productionplan/schedualcampaign/create'/>" method="post">
            <table border="1">
                <thead>
                    <tr>
                        <th rowspan="2">Product</th>
                        <th colspan="3">15/10/2004</th>
                        <th colspan="3">16/10/2004</th>
                        <th colspan="3">17/10/2004</th>
                        <th colspan="3">18/10/2004</th>
                    </tr>
                    <tr>
                        <th>K1</th>
                        <th>K2</th>
                        <th>K3</th>
                        <th>K1</th>
                        <th>K2</th>
                        <th>K3</th>
                        <th>K1</th>
                        <th>K2</th>
                        <th>K3</th>
                        <th>K1</th>
                        <th>K2</th>
                        <th>K3</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>Basket (P1)</td>
                        <c:forEach var="i" begin="1" end="12">
                            <td>
                                <input type="text" name="quantity_P1_${i}" />
                                <input type="hidden" name="shift_P1_${i}" value="${i % 3 == 1 ? 1 : (i % 3 == 2 ? 2 : 3)}"/>
                                <input type="hidden" name="date_P1_${i}" value="${i <= 3 ? '2004-10-15' : (i <= 6 ? '2004-10-16' : (i <= 9 ? '2004-10-17' : '2004-10-18'))}"/>
                            </td>
                        </c:forEach>
                    </tr>
                    <tr>
                        <td>Winnowing Tray (P2)</td>
                        <c:forEach var="i" begin="1" end="12">
                            <td>
                                <input type="text" name="quantity_P2_${i}" />
                                <input type="hidden" name="shift_P2_${i}" value="${i % 3 == 1 ? 1 : (i % 3 == 2 ? 2 : 3)}"/>
                                <input type="hidden" name="date_P2_${i}" value="${i <= 3 ? '2004-10-15' : (i <= 6 ? '2004-10-16' : (i <= 9 ? '2004-10-17' : '2004-10-18'))}"/>
                            </td>
                        </c:forEach>
                    </tr>
                </tbody>
            </table>
            <br>
            <input type="submit" value="Create Schedule" />
        </form>
        <br>
        <a href="../dashboard.jsp">Back to Dashboard</a>
    </body>
</html>
