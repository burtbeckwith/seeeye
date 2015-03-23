dataSource {
	pooled = true
	jmxExport = true
	driverClassName = 'org.h2.Driver'
	username = 'sa'
	password = ''
	dbCreate = 'update'
	url = 'jdbc:h2:mem:testDb'
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory'
	singleSession = true
	flush.mode = 'manual'
	format_sql = true
	use_sql_comments = true
}
