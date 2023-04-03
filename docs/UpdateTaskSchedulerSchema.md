
# UpdateTaskSchedulerSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paused** | **kotlin.Boolean** | The scheduler paused state |  [optional]
**repeatEvery** | **kotlin.String** | Accepted values (DAY,WEEK,MONTH,3MONTHS,YEAR) |  [optional]
**startFrom** | **kotlin.Int** | Timestamp when we should start the scheduler, default is today |  [optional]
**job** | **kotlin.String** | Job, we can find list of available jobs in Scheduler model |  [optional]
**dateRange** | **kotlin.String** | The string representation of the date range of data to be returned |  [optional]
**dateKey** | **kotlin.String** | The date column to search between. |  [optional]
**startDate** | **kotlin.String** | The start date to search between |  [optional]
**endDate** | **kotlin.String** | The end date to search between |  [optional]



