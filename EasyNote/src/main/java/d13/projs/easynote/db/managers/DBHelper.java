package d13.projs.easynote.db.managers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import d13.projs.easynote.R;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: hoziain
 * Date: 09.05.12
 * Time: 23:55
 * To change this template use File | Settings | File Templates.
 */
public class DBHelper extends OrmLiteSqliteOpenHelper {
    private static final int DATABASE_VERSION = 1;

  /*  private static Dao<Status, String> _statusDao = null;
    private static Dao<Region, Integer> _regionDao = null;
    private static Dao<Airport, Integer> _airportDao = null;
    private static Dao<Division, Integer> _divisionDao = null;
    private static Dao<City, Integer> _cityDao = null;
    private static Dao<RegionLimit, Integer> _regionLimitDao = null;
    private static Dao<AdditionalService, Integer> _additionalServiceDao = null;
    private static Dao<Tariff, Integer> _tariffDao = null;
    private static Dao<TariffGroup, Integer> _tariffGroupDao = null;
    private static Dao<RegionLimitToTariff, Integer> _regionLimitToTariffDao = null;
    private static Dao<TransferCondition, Integer> _transferConditionDao = null;
    private static Dao<TimePrice, Integer> _timePriceDao = null;
    private static Dao<TariffPart, Integer> _tariffPartDao = null;
    private static Dao<AirportTransfer, Integer> _airportTransferDao = null;
    private static Dao<ServiceInformation, Integer> _serviceInformationDao = null;*/


//    protected Context context;


    public DBHelper(Context context) {
        super(context, context.getResources().getString(R.string.db_name), null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        //To change body of implemented methods use File | Settings | File Templates.
       // try {
            /*TableUtils.createTableIfNotExists(connectionSource, Status.class);
            TableUtils.createTableIfNotExists(connectionSource, Region.class);
            TableUtils.createTableIfNotExists(connectionSource, Airport.class);
            TableUtils.createTableIfNotExists(connectionSource, City.class);
            TableUtils.createTableIfNotExists(connectionSource, Division.class);
            TableUtils.createTableIfNotExists(connectionSource, RegionLimit.class);
            TableUtils.createTableIfNotExists(connectionSource, AdditionalService.class);
            TableUtils.createTableIfNotExists(connectionSource, Tariff.class);
            TableUtils.createTableIfNotExists(connectionSource, TariffGroup.class);
            TableUtils.createTableIfNotExists(connectionSource, RegionLimitToTariff.class);
            TableUtils.createTableIfNotExists(connectionSource, TransferCondition.class);
            TableUtils.createTableIfNotExists(connectionSource, TimePrice.class);
            TableUtils.createTableIfNotExists(connectionSource, TariffPart.class);
            TableUtils.createTableIfNotExists(connectionSource, AirportTransfer.class);
            TableUtils.createTableIfNotExists(connectionSource, ServiceInformation.class);*/


       // } catch (SQLException e) {
        //    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
       // }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int i, int i1) {
        //To change body of implemented methods use File | Settings | File Templates.   //
    }


    /*public Dao<Region, Integer> getRegionDao() throws SQLException {
        if (_regionDao == null) {
            _regionDao = getDao(Region.class);
        }
        return _regionDao;
    }

    public Dao<Airport, Integer> getAirportDao() throws SQLException {
        if (_airportDao == null) {
            _airportDao = getDao(Airport.class);
        }
        return _airportDao;
    }

    public Dao<Division, Integer> getDivisionDao() throws SQLException {
        if (_divisionDao == null) {
            _divisionDao = getDao(Division.class);
        }
        return _divisionDao;
    }

    public Dao<City, Integer> getCityDao() throws SQLException {
        if (_cityDao == null) {
            _cityDao = getDao(City.class);
        }
        return _cityDao;
    }

    public Dao<Status, String> getStatusDao() throws SQLException {
        if (_statusDao == null) {
            _statusDao = getDao(Status.class);
        }
        return _statusDao;
    }

    public Dao<RegionLimit, Integer> getRegionLimitDao() throws SQLException {
        if (_regionLimitDao == null) {
            _regionLimitDao = getDao(RegionLimit.class);
        }
        return _regionLimitDao;
    }

    public Dao<AdditionalService, Integer> getAdditionalServiceDao() throws SQLException {
        if (_additionalServiceDao == null) {
            _additionalServiceDao = getDao(AdditionalService.class);
        }
        return _additionalServiceDao;
    }

    public Dao<Tariff, Integer> getTariffDao() throws SQLException {
        if (_tariffDao == null) {
            _tariffDao = getDao(Tariff.class);
        }
        return _tariffDao;
    }

    public Dao<TariffGroup, Integer> getTariffGroupDao() throws SQLException {
        if (_tariffGroupDao == null) {
            _tariffGroupDao = getDao(TariffGroup.class);
        }
        return _tariffGroupDao;
    }

    public Dao<RegionLimitToTariff, Integer> getRegionLimitToTariffDao() throws SQLException {
        if (_regionLimitToTariffDao == null) {
            _regionLimitToTariffDao = getDao(RegionLimitToTariff.class);
        }
        return _regionLimitToTariffDao;
    }

    public Dao<TransferCondition, Integer> getTransferConditionDao() throws SQLException {
        if (_transferConditionDao == null) {
            _transferConditionDao = getDao(TransferCondition.class);
        }
        return _transferConditionDao;
    }

    public Dao<TimePrice, Integer> getTimePriceDao() throws SQLException {
        if (_timePriceDao == null) {
            _timePriceDao = getDao(TimePrice.class);
        }
        return _timePriceDao;
    }

    public Dao<TariffPart, Integer> getTariffPartDao() throws SQLException {
        if (_tariffPartDao == null) {
            _tariffPartDao = getDao(TariffPart.class);
        }
        return _tariffPartDao;
    }

    public Dao<AirportTransfer, Integer> getAirportTransferDao() throws SQLException {
        if (_airportTransferDao == null) {
            _airportTransferDao = getDao(AirportTransfer.class);
        }
        return _airportTransferDao;
    }

    public Dao<ServiceInformation, Integer> getServiceInformationDao() throws SQLException {
        if (_serviceInformationDao == null) {
            _serviceInformationDao = getDao(ServiceInformation.class);
        }
        return _serviceInformationDao;
    }
*/

    @Override
    public void close() {
//        super.close();
//        _regionDao = null;
//        _airportDao = null;
//        _divisionDao = null;
//        _cityDao = null;
    }
}
