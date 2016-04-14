
-- Display all vehicles information sorting ASC according to the price

use vehicles;
Select vehicle.vehicleID AS ID, enginetype.engineType AS 'Engine Type', vehicleType.vehicleType AS 'Vehicle Type',
vehicle.vinNumber AS VIN, vehiclebrand.brand AS Brand, vehiclecolor.color AS Color, vehicle.price As Price, vehicle.year AS Year
from vehicle
JOIN vehiclebrand
ON vehicle.vehicleBrandID = vehiclebrand.vehicleBrandID
JOIN vehiclecolor 
ON vehicle.vehicleColorID =  vehiclecolor.vehicleColorID
JOIN vehicletype
ON vehicle.vehicleTypeID = vehicletype.vehicleTypeID
JOIN enginetype
ON vehicle.engineTypeID = enginetype.engineTypeID
ORDER BY vehicle.price;





-- Display the vehicle type and the price only with sorting ASC according to the price

use vehicles;
Select vehicle.vehicleID AS ID,  vehicleType.vehicleType AS 'Vehicle Type', vehicle.price As Price
from vehicle
JOIN vehicletype
ON vehicle.vehicleTypeID = vehicletype.vehicleTypeID
ORDER BY vehicle.price;


-- Display average cost per car type sorted by price
SELECT vehicleType.vehicleType AS 'Vehicle Type', CAST(avg(vehicle.price)AS DECIMAL(10,3)) As 'AVG Type'
from vehicle
JOIN vehicletype
ON vehicle.vehicleTypeID = vehicletype.vehicleTypeID
group by vehicletype.vehicleType
ORDER by vehicle.price;


-- Display average cost per brand type sorted by price

SELECT vehiclebrand.brand AS 'Vehicle Brand', CAST(avg(vehicle.price)AS DECIMAL(10,3)) As 'AVG Type'
from vehicle
JOIN vehiclebrand
ON vehicle.vehicleBrandID = vehiclebrand.vehicleBrandID
group by vehiclebrand.brand
ORDER by vehicle.price;

-- Display average cost per Engine Type sorted by price

SELECT enginetype.engineType AS 'Engine Type', CAST(avg(vehicle.price)AS DECIMAL(10,3)) As 'AVG Type'
from vehicle
JOIN enginetype
ON vehicle.engineTypeID = enginetype.engineTypeID
group by enginetype.engineType
ORDER by vehicle.price;


-- Display average cost per Vehicle Color Type sorted by price
SELECT vehiclecolor.color AS 'Vehicle Color Type', CAST(avg(vehicle.price)AS DECIMAL(10,3)) As 'AVG Type'
from vehicle
JOIN vehiclecolor
ON vehicle.vehicleColorID = vehiclecolor.vehicleColorID
group by vehiclecolor.vehicleColorID
ORDER by vehicle.price;
