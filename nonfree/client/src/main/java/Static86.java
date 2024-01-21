import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!p", name = "Pc", descriptor = "Lclient!vd;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!p", name = "Rc", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_16;

	@OriginalMember(owner = "client!p", name = "ad", descriptor = "Lclient!ga;")
	public static Class29 aClass29_15;

	@OriginalMember(owner = "client!p", name = "td", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!p", name = "ud", descriptor = "Lclient!ga;")
	public static Class29 aClass29_16;

	@OriginalMember(owner = "client!p", name = "xd", descriptor = "Lclient!ga;")
	public static Class29 aClass29_17;

	@OriginalMember(owner = "client!p", name = "Ad", descriptor = "Lclient!bf;")
	public static Class6_Sub4 aClass6_Sub4_5;

	@OriginalMember(owner = "client!p", name = "Id", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!p", name = "cd", descriptor = "[I")
	public static int[] anIntArray276 = new int[2000];

	@OriginalMember(owner = "client!p", name = "gd", descriptor = "I")
	public static int anInt2366 = 3;

	@OriginalMember(owner = "client!p", name = "md", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1236 = Static80.method1463("::errortest");

	@OriginalMember(owner = "client!p", name = "nd", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!p", name = "rd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1238 = Static80.method1463("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!p", name = "yd", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1239 = Static80.method1463("Classic");

	@OriginalMember(owner = "client!p", name = "Dd", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1242 = Static80.method1463("On");

	@OriginalMember(owner = "client!p", name = "zd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1240 = aClass63_1242;

	@OriginalMember(owner = "client!p", name = "Bd", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!p", name = "Cd", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1241 = Static80.method1463("wave2:");

	@OriginalMember(owner = "client!p", name = "Ed", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1243 = Static80.method1463("backtop1");

	@OriginalMember(owner = "client!p", name = "Fd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1244 = aClass63_1241;

	@OriginalMember(owner = "client!p", name = "Gd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1245 = aClass63_1239;

	@OriginalMember(owner = "client!p", name = "Hd", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1246 = aClass63_1241;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public static int method1552(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)V")
	public static void method1554() {
		aClass63_1236 = null;
		aClass63_1246 = null;
		aClass63_1238 = null;
		aClass29_15 = null;
		anIntArray278 = null;
		anIntArray277 = null;
		aClass63_1243 = null;
		aBigInteger1 = null;
		aClass63_1242 = null;
		aClass63_1240 = null;
		aShortArrayArray1 = null;
		aClass63_1244 = null;
		aClass29_17 = null;
		aClass7_Sub1_16 = null;
		anIntArray276 = null;
		aClass29_16 = null;
		aClass6_Sub4_5 = null;
		aClass63_1241 = null;
		aClass63_1239 = null;
		aClass63_1245 = null;
		aClass56_1 = null;
	}
}
