import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "Lclient!ud;")
	public static Class1_Sub3_Sub23 aClass1_Sub3_Sub23_1;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_892 = Static187.method3089("<)4col> x");

	@OriginalMember(owner = "client!jh", name = "W", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_896 = Static187.method3089("Drop");

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "Lclient!vd;")
	public static Class92 aClass92_893 = aClass92_896;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_894 = Static187.method3089("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!jh", name = "U", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_895 = Static187.method3089("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
	public static int anInt2004 = 0;

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_897 = Static187.method3089(" x ");

	@OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_898 = Static187.method3089("Hier wechseln");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!uc;I)V")
	public static void method1382(@OriginalArg(1) Class1_Sub14_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub27 local15 = (Class1_Sub27) Static107.aClass20_13.method467();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt4514; local22++) {
				if (local15.aClass65Array1[local22] != null) {
					if (local15.aClass65Array1[local22].anInt2681 == 2) {
						local15.anIntArray370[local22] = -5;
					}
					if (local15.aClass65Array1[local22].anInt2681 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass65Array2[local22] != null) {
					if (local15.aClass65Array2[local22].anInt2681 == 2) {
						local15.anIntArray370[local22] = -6;
					}
					if (local15.aClass65Array2[local22].anInt2681 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method3067(224);
			arg0.method3024(0);
			@Pc(95) int local95 = arg0.anInt4061;
			arg0.method3032(local15.anInt4512);
			for (@Pc(102) int local102 = 0; local102 < local15.anInt4514; local102++) {
				if (local15.anIntArray370[local102] == 0) {
					try {
						@Pc(123) int local123 = local15.anIntArray369[local102];
						@Pc(143) Field local143;
						@Pc(146) int local146;
						if (local123 == 0) {
							local143 = (Field) local15.aClass65Array1[local102].anObject3;
							local146 = local143.getInt(null);
							arg0.method3024(0);
							arg0.method3032(local146);
						} else if (local123 == 1) {
							local143 = (Field) local15.aClass65Array1[local102].anObject3;
							local143.setInt(null, local15.anIntArray368[local102]);
							arg0.method3024(0);
						} else if (local123 == 2) {
							local143 = (Field) local15.aClass65Array1[local102].anObject3;
							local146 = local143.getModifiers();
							arg0.method3024(0);
							arg0.method3032(local146);
						}
						@Pc(210) Method local210;
						if (local123 == 3) {
							local210 = (Method) local15.aClass65Array2[local102].anObject3;
							@Pc(235) byte[][] local235 = local15.aByteArrayArrayArray53[local102];
							@Pc(239) Object[] local239 = new Object[local235.length];
							for (@Pc(241) int local241 = 0; local241 < local235.length; local241++) {
								@Pc(253) ObjectInputStream local253 = new ObjectInputStream(new ByteArrayInputStream(local235[local241]));
								local239[local241] = local253.readObject();
							}
							@Pc(268) Object local268 = local210.invoke(null, local239);
							if (local268 == null) {
								arg0.method3024(0);
							} else if (local268 instanceof Number) {
								arg0.method3024(1);
								arg0.method3016(((Number) local268).longValue());
							} else if (local268 instanceof Class92) {
								arg0.method3024(2);
								arg0.method3018((Class92) local268);
							} else {
								arg0.method3024(4);
							}
						} else if (local123 == 4) {
							local210 = (Method) local15.aClass65Array2[local102].anObject3;
							local146 = local210.getModifiers();
							arg0.method3024(0);
							arg0.method3032(local146);
						}
					} catch (@Pc(311) ClassNotFoundException local311) {
						arg0.method3024(-10);
					} catch (@Pc(317) InvalidClassException local317) {
						arg0.method3024(-11);
					} catch (@Pc(323) StreamCorruptedException local323) {
						arg0.method3024(-12);
					} catch (@Pc(329) OptionalDataException local329) {
						arg0.method3024(-13);
					} catch (@Pc(335) IllegalAccessException local335) {
						arg0.method3024(-14);
					} catch (@Pc(341) IllegalArgumentException local341) {
						arg0.method3024(-15);
					} catch (@Pc(347) InvocationTargetException local347) {
						arg0.method3024(-16);
					} catch (@Pc(353) SecurityException local353) {
						arg0.method3024(-17);
					} catch (@Pc(359) IOException local359) {
						arg0.method3024(-18);
					} catch (@Pc(365) NullPointerException local365) {
						arg0.method3024(-19);
					} catch (@Pc(371) Exception local371) {
						arg0.method3024(-20);
					} catch (@Pc(377) Throwable local377) {
						arg0.method3024(-21);
					}
				} else {
					arg0.method3024(local15.anIntArray370[local102]);
				}
			}
			arg0.method3040(local95);
			arg0.method3042(arg0.anInt4061 - local95);
			local15.method3414();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!vd;Lclient!ka;I)I")
	public static int method1383(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(2) int local2 = arg1.anInt4061;
		arg1.method3041(arg0.anInt4244);
		arg1.anInt4061 += Static24.aClass50_1.method1361(arg1.aByteArray49, arg0.anInt4244, arg1.anInt4061, arg0.aByteArray52, 0);
		return arg1.anInt4061 - local2;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIIIIII)V")
	public static void method1386(@OriginalArg(0) int[] arg0) {
		Static62.anInt1472 = 25;
		Static128.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static62.anInt1472 + Static62.anInt1472 + 1][Static62.anInt1472 + Static62.anInt1472 + 1];
		Static12.anInt367 = 0;
		Static192.anInt4181 = 0;
		Static209.anInt4498 = 512;
		Static102.anInt2210 = 334;
		Static42.anInt1092 = 256;
		Static33.anInt802 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static62.anInt1472 + Static62.anInt1472 + 3][Static62.anInt1472 + Static62.anInt1472 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static53.anInt1312 = Class1_Sub3_Sub1_Sub4.anIntArray320[local47];
				Static62.anInt1477 = Class1_Sub3_Sub1_Sub4.anIntArray317[local47];
				Static165.anInt3434 = Class1_Sub3_Sub1_Sub4.anIntArray320[local50];
				Static109.anInt2361 = Class1_Sub3_Sub1_Sub4.anIntArray317[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static62.anInt1472 + 1); local82 <= Static62.anInt1472 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static62.anInt1472 + 1); local88 <= Static62.anInt1472 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static76.method1143(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static62.anInt1472 + 1][local88 + Static62.anInt1472 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static62.anInt1472; local77 < Static62.anInt1472; local77++) {
					for (local82 = -Static62.anInt1472; local82 < Static62.anInt1472; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static62.anInt1472 + 1][local82 + local97 + Static62.anInt1472 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static62.anInt1472 + 1][local82 + local97 + Static62.anInt1472 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static62.anInt1472 + 1][local82 + local97 + Static62.anInt1472 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static62.anInt1472 + 1][local82 + local97 + Static62.anInt1472 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static128.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static62.anInt1472][local82 + Static62.anInt1472] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!ab;B)[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] method1387(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		return Static163.method2693(arg1, arg0) ? Static201.method3331() : null;
	}
}
