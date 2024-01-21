import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "Lclient!qf;")
	public static Class77 aClass77_9;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!af;")
	public static final Class5 aClass5_28 = new Class5(64);

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_810 = Static120.method1824("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!qf;")
	public static Class77 aClass77_8 = null;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "[I")
	public static final int[] anIntArray279 = new int[5];

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_811 = Static120.method1824("; Expires=");

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
	public static int anInt2012 = 0;

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_812 = Static120.method1824("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "[Lclient!gg;")
	public static final Class34[] aClass34Array1 = new Class34[4];

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
	public static int anInt2015 = 2;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!mb;I)Lclient!ga;")
	public static Class31_Sub1 method1431(@OriginalArg(0) Class3_Sub17 arg0) {
		return new Class31_Sub1(arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2136(), arg0.method2107());
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
	public static int method1432(@OriginalArg(0) int arg0) {
		@Pc(3) Class3_Sub1_Sub13 local3 = Static20.method341(arg0);
		@Pc(10) int local10 = local3.anInt2613;
		@Pc(13) int local13 = local3.anInt2615;
		@Pc(21) int local21 = local3.anInt2620;
		@Pc(28) int local28 = Class3_Sub3.anIntArray33[local21 - local10];
		return local28 & Static41.anIntArray131[local13] >> local10;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	public static void method1433() {
		for (@Pc(14) Class3_Sub1_Sub5_Sub1 local14 = (Class3_Sub1_Sub5_Sub1) Static164.aClass70_22.method1953(); local14 != null; local14 = (Class3_Sub1_Sub5_Sub1) Static164.aClass70_22.method1948()) {
			if (Static153.anInt673 != local14.anInt958 || local14.anInt957 < Static193.anInt4411) {
				local14.method3159();
			} else if (Static193.anInt4411 >= local14.anInt946) {
				if (local14.anInt949 > 0) {
					@Pc(49) Class3_Sub1_Sub5_Sub4_Sub1 local49 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local14.anInt949 - 1];
					if (local49 != null && local49.anInt4329 >= 0 && local49.anInt4329 < 13312 && local49.anInt4315 >= 0 && local49.anInt4315 < 13312) {
						local14.method647(local49.anInt4329, Static50.method742(local14.anInt958, local49.anInt4315, local49.anInt4329) - local14.anInt952, Static193.anInt4411, local49.anInt4315);
					}
				}
				if (local14.anInt949 < 0) {
					@Pc(100) int local100 = -local14.anInt949 - 1;
					@Pc(111) Class3_Sub1_Sub5_Sub4_Sub2 local111;
					if (Static30.anInt4494 == local100) {
						local111 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1;
					} else {
						local111 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local100];
					}
					if (local111 != null && local111.anInt4329 >= 0 && local111.anInt4329 < 13312 && local111.anInt4315 >= 0 && local111.anInt4315 < 13312) {
						local14.method647(local111.anInt4329, Static50.method742(local14.anInt958, local111.anInt4315, local111.anInt4329) - local14.anInt952, Static193.anInt4411, local111.anInt4315);
					}
				}
				local14.method646(Static152.anInt3407);
				Static49.method738(Static153.anInt673, (int) local14.aDouble6, (int) local14.aDouble3, (int) local14.aDouble7, 60, local14, local14.anInt963, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
	public static void method1434() {
		for (@Pc(8) int local8 = 0; local8 < Static59.anInt1317; local8++) {
			@Pc(14) int local14 = Static125.anIntArray359[local8];
			@Pc(18) Class3_Sub1_Sub5_Sub4_Sub1 local18 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local14];
			if (local18 != null) {
				Static130.method1962(local18.aClass3_Sub1_Sub7_1.anInt912, local18);
			}
		}
	}
}
