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

public final class Static96 {

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public static int anInt2375 = 0;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_32 = new Class6(40, 10);

	@OriginalMember(owner = "client!du", name = "o", descriptor = "Lclient!kv;")
	public static final Class171 aClass171_2 = new Class171();

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLclient!ica;Lclient!uh;ILclient!ks;III)V")
	public static void method2188(@OriginalArg(1) Class47_Sub2_Sub3_Sub1 arg0, @OriginalArg(2) Class288 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class47_Sub2_Sub3_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub9 local7 = new Class1_Sub9();
		local7.anInt2348 = arg4 << 7;
		local7.anInt2353 = arg5 << 7;
		local7.anInt2352 = arg2;
		if (arg1 != null) {
			local7.aClass288_1 = arg1;
			@Pc(131) int local131 = arg1.anInt8365;
			@Pc(134) int local134 = arg1.anInt8343;
			if (arg6 == 1 || arg6 == 3) {
				local134 = arg1.anInt8365;
				local131 = arg1.anInt8343;
			}
			local7.anInt2354 = arg1.anInt8328;
			local7.anInt2364 = local134 + arg5 << 7;
			local7.anInt2350 = arg1.anInt8348 << 7;
			local7.anInt2355 = arg1.anInt8350;
			local7.anInt2359 = arg1.anInt8340;
			local7.anIntArray188 = arg1.anIntArray652;
			local7.anInt2363 = arg4 + local131 << 7;
			local7.anInt2351 = arg1.anInt8334;
			if (arg1.anIntArray650 != null) {
				local7.aBoolean169 = true;
				local7.method2185();
			}
			if (local7.anIntArray188 != null) {
				local7.anInt2361 = local7.anInt2354 + (int) ((double) (local7.anInt2355 - local7.anInt2354) * Math.random());
			}
			Static497.aClass38_70.method1426(local7);
		} else if (arg0 != null) {
			local7.aClass47_Sub2_Sub3_Sub1_1 = arg0;
			@Pc(76) Class238 local76 = arg0.aClass238_1;
			if (local76.anIntArray511 != null) {
				local7.aBoolean169 = true;
				local76 = local76.method5866(Static343.aClass286_1);
			}
			if (local76 != null) {
				local7.anInt2363 = local76.anInt6754 + arg4 << 7;
				local7.anInt2364 = local76.anInt6754 + arg5 << 7;
				local7.anInt2359 = Static396.method5973(arg0);
				local7.anInt2351 = local76.anInt6788;
				local7.anInt2350 = local76.anInt6758 << 7;
			}
			Static94.aClass38_20.method1426(local7);
		} else if (arg3 != null) {
			local7.aClass47_Sub2_Sub3_Sub2_2 = arg3;
			local7.anInt2363 = arg3.method4350() + arg4 << 7;
			local7.anInt2364 = arg5 + arg3.method4350() << 7;
			local7.anInt2359 = Static179.method3452(arg3);
			local7.anInt2350 = arg3.anInt5094 << 7;
			local7.anInt2351 = arg3.anInt5096;
			Static527.aClass174_39.method4420(local7, (long) arg3.anInt5045);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!gba;I)V")
	public static void method2189(@OriginalArg(1) Class1_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(12) Class1_Sub4 local12 = (Class1_Sub4) Static205.aClass38_30.method1419();
			if (local12 == null) {
				return;
			}
			@Pc(17) boolean local17 = false;
			for (@Pc(19) int local19 = 0; local19 < local12.anInt849; local19++) {
				if (local12.aClass243Array2[local19] != null) {
					if (local12.aClass243Array2[local19].anInt6905 == 2) {
						local12.anIntArray37[local19] = -5;
					}
					if (local12.aClass243Array2[local19].anInt6905 == 0) {
						local17 = true;
					}
				}
				if (local12.aClass243Array1[local19] != null) {
					if (local12.aClass243Array1[local19].anInt6905 == 2) {
						local12.anIntArray37[local19] = -6;
					}
					if (local12.aClass243Array1[local19].anInt6905 == 0) {
						local17 = true;
					}
				}
			}
			if (local17) {
				return;
			}
			arg0.method3083(arg1);
			arg0.method3060(0);
			@Pc(96) int local96 = arg0.anInt3400;
			arg0.method3069(local12.anInt850);
			for (@Pc(103) int local103 = 0; local103 < local12.anInt849; local103++) {
				if (local12.anIntArray37[local103] == 0) {
					try {
						@Pc(127) int local127 = local12.anIntArray35[local103];
						@Pc(142) Field local142;
						@Pc(171) int local171;
						if (local127 == 0) {
							local142 = (Field) local12.aClass243Array2[local103].anObject12;
							local171 = local142.getInt(null);
							arg0.method3060(0);
							arg0.method3069(local171);
						} else if (local127 == 1) {
							local142 = (Field) local12.aClass243Array2[local103].anObject12;
							local142.setInt(null, local12.anIntArray36[local103]);
							arg0.method3060(0);
						} else if (local127 == 2) {
							local142 = (Field) local12.aClass243Array2[local103].anObject12;
							local171 = local142.getModifiers();
							arg0.method3060(0);
							arg0.method3069(local171);
						}
						@Pc(216) Method local216;
						if (local127 == 3) {
							local216 = (Method) local12.aClass243Array1[local103].anObject12;
							@Pc(240) byte[][] local240 = local12.aByteArrayArrayArray1[local103];
							@Pc(244) Object[] local244 = new Object[local240.length];
							for (@Pc(246) int local246 = 0; local246 < local240.length; local246++) {
								@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local240[local246]));
								local244[local246] = local257.readObject();
							}
							@Pc(276) Object local276 = local216.invoke(null, local244);
							if (local276 == null) {
								arg0.method3060(0);
							} else if (local276 instanceof Number) {
								arg0.method3060(1);
								arg0.method3036(((Number) local276).longValue());
							} else if (local276 instanceof String) {
								arg0.method3060(2);
								arg0.method3061((String) local276);
							} else {
								arg0.method3060(4);
							}
						} else if (local127 == 4) {
							local216 = (Method) local12.aClass243Array1[local103].anObject12;
							local171 = local216.getModifiers();
							arg0.method3060(0);
							arg0.method3069(local171);
						}
					} catch (@Pc(322) ClassNotFoundException local322) {
						arg0.method3060(-10);
					} catch (@Pc(328) InvalidClassException local328) {
						arg0.method3060(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method3060(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method3060(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method3060(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method3060(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method3060(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method3060(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method3060(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method3060(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method3060(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method3060(-21);
					}
				} else {
					arg0.method3060(local12.anIntArray37[local103]);
				}
			}
			arg0.method3074(local96);
			arg0.method3077(arg0.anInt3400 - local96);
			local12.method7983();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([[II)V")
	public static void method2190(@OriginalArg(0) int[][] arg0) {
		Static81.anIntArrayArray25 = arg0;
	}
}
