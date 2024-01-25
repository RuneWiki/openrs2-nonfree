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

public final class Static93 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!rq;")
	public static final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public static int anInt2300 = 0;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public static int anInt2303 = -1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static79.aFloat49 < Static79.aFloat50) {
			Static79.aFloat49 = (float) ((double) Static79.aFloat49 + (double) Static79.aFloat49 / 30.0D);
			if (Static79.aFloat50 < Static79.aFloat49) {
				Static79.aFloat49 = Static79.aFloat50;
			}
			Static246.method4421();
			Static79.anInt4154 = (int) Static79.aFloat49 >> 1;
			Static79.aByteArrayArrayArray7 = Static71.method3165(Static79.anInt4154);
		} else if (Static79.aFloat50 < Static79.aFloat49) {
			Static79.aFloat49 = (float) ((double) Static79.aFloat49 - (double) Static79.aFloat49 / 30.0D);
			if (Static79.aFloat50 > Static79.aFloat49) {
				Static79.aFloat49 = Static79.aFloat50;
			}
			Static246.method4421();
			Static79.anInt4154 = (int) Static79.aFloat49 >> 1;
			Static79.aByteArrayArrayArray7 = Static71.method3165(Static79.anInt4154);
		}
		if (Static231.anInt4758 != -1 && Static68.anInt1821 != -1) {
			@Pc(85) int local85 = Static231.anInt4758 - Static62.anInt1771;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(100) int local100 = Static68.anInt1821 - Static169.anInt3636;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static62.anInt1771 += local85;
			Static169.anInt3636 += local100;
			if (local85 == 0 && local100 == 0) {
				Static231.anInt4758 = -1;
				Static68.anInt1821 = -1;
			}
			Static246.method4421();
		}
		if (Static339.anInt6507 <= 0) {
			Static259.anInt2903 = -1;
			Static128.anInt6686 = -1;
		} else {
			Static139.anInt4713--;
			if (Static139.anInt4713 == 0) {
				Static339.anInt6507--;
				Static139.anInt4713 = 100;
			}
		}
		if (!Static320.aBoolean514 || Static280.aClass16_32 == null) {
			return;
		}
		for (@Pc(170) Class1_Sub28 local170 = (Class1_Sub28) Static280.aClass16_32.method410(); local170 != null; local170 = (Class1_Sub28) Static280.aClass16_32.method419()) {
			@Pc(178) Class139 local178 = Static255.method4606(local170.aClass1_Sub27_1.anInt4777);
			if (Static174.anInt3787 == 0 && local170.method4574(arg1, arg0)) {
				if (local178.aStringArray44 != null) {
					if (local178.aStringArray44[4] != null) {
						Static58.method1506(-1, local178.aString36, 0, (long) local170.aClass1_Sub27_1.anInt4777, local178.aStringArray44[4], local178.anInt4246, 1004);
					}
					if (local178.aStringArray44[3] != null) {
						Static58.method1506(-1, local178.aString36, 0, (long) local170.aClass1_Sub27_1.anInt4777, local178.aStringArray44[3], local178.anInt4246, 1008);
					}
					if (local178.aStringArray44[2] != null) {
						Static58.method1506(-1, local178.aString36, 0, (long) local170.aClass1_Sub27_1.anInt4777, local178.aStringArray44[2], local178.anInt4246, 1006);
					}
					if (local178.aStringArray44[1] != null) {
						Static58.method1506(-1, local178.aString36, 0, (long) local170.aClass1_Sub27_1.anInt4777, local178.aStringArray44[1], local178.anInt4246, 1007);
					}
					if (local178.aStringArray44[0] != null) {
						Static58.method1506(-1, local178.aString36, 0, (long) local170.aClass1_Sub27_1.anInt4777, local178.aStringArray44[0], local178.anInt4246, 1003);
					}
				}
				if (!local170.aClass1_Sub27_1.aBoolean461) {
					local170.aClass1_Sub27_1.aBoolean461 = true;
					Static196.method3776(15, local170.aClass1_Sub27_1.anInt4777, local178.anInt4246);
				}
				if (local170.aClass1_Sub27_1.aBoolean461) {
					Static196.method3776(17, local170.aClass1_Sub27_1.anInt4777, local178.anInt4246);
				}
			} else if (local170.aClass1_Sub27_1.aBoolean461) {
				local170.aClass1_Sub27_1.aBoolean461 = false;
				Static196.method3776(16, local170.aClass1_Sub27_1.anInt4777, local178.anInt4246);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kl;BI)V")
	public static void method2019(@OriginalArg(0) Class1_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(15) Class1_Sub18 local15 = (Class1_Sub18) Static50.aClass16_4.method410();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2594; local22++) {
				if (local15.aClass162Array2[local22] != null) {
					if (local15.aClass162Array2[local22].anInt4801 == 2) {
						local15.anIntArray244[local22] = -5;
					}
					if (local15.aClass162Array2[local22].anInt4801 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass162Array1[local22] != null) {
					if (local15.aClass162Array1[local22].anInt4801 == 2) {
						local15.anIntArray244[local22] = -6;
					}
					if (local15.aClass162Array1[local22].anInt4801 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method3229(191);
			arg0.method4562(0);
			@Pc(99) int local99 = arg0.anInt5182;
			arg0.method4529(local15.anInt2593);
			for (@Pc(106) int local106 = 0; local106 < local15.anInt2594; local106++) {
				if (local15.anIntArray244[local106] == 0) {
					try {
						@Pc(130) int local130 = local15.anIntArray242[local106];
						@Pc(148) Field local148;
						@Pc(151) int local151;
						if (local130 == 0) {
							local148 = (Field) local15.aClass162Array2[local106].anObject5;
							local151 = local148.getInt(null);
							arg0.method4562(0);
							arg0.method4529(local151);
						} else if (local130 == 1) {
							local148 = (Field) local15.aClass162Array2[local106].anObject5;
							local148.setInt(null, local15.anIntArray243[local106]);
							arg0.method4562(0);
						} else if (local130 == 2) {
							local148 = (Field) local15.aClass162Array2[local106].anObject5;
							local151 = local148.getModifiers();
							arg0.method4562(0);
							arg0.method4529(local151);
						}
						@Pc(215) Method local215;
						if (local130 == 3) {
							local215 = (Method) local15.aClass162Array1[local106].anObject5;
							@Pc(240) byte[][] local240 = local15.aByteArrayArrayArray4[local106];
							@Pc(244) Object[] local244 = new Object[local240.length];
							for (@Pc(246) int local246 = 0; local246 < local240.length; local246++) {
								@Pc(258) ObjectInputStream local258 = new ObjectInputStream(new ByteArrayInputStream(local240[local246]));
								local244[local246] = local258.readObject();
							}
							@Pc(273) Object local273 = local215.invoke(null, local244);
							if (local273 == null) {
								arg0.method4562(0);
							} else if (local273 instanceof Number) {
								arg0.method4562(1);
								arg0.method4560(((Number) local273).longValue());
							} else if (local273 instanceof String) {
								arg0.method4562(2);
								arg0.method4531((String) local273);
							} else {
								arg0.method4562(4);
							}
						} else if (local130 == 4) {
							local215 = (Method) local15.aClass162Array1[local106].anObject5;
							local151 = local215.getModifiers();
							arg0.method4562(0);
							arg0.method4529(local151);
						}
					} catch (@Pc(316) ClassNotFoundException local316) {
						arg0.method4562(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg0.method4562(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg0.method4562(-12);
					} catch (@Pc(334) OptionalDataException local334) {
						arg0.method4562(-13);
					} catch (@Pc(340) IllegalAccessException local340) {
						arg0.method4562(-14);
					} catch (@Pc(346) IllegalArgumentException local346) {
						arg0.method4562(-15);
					} catch (@Pc(352) InvocationTargetException local352) {
						arg0.method4562(-16);
					} catch (@Pc(358) SecurityException local358) {
						arg0.method4562(-17);
					} catch (@Pc(364) IOException local364) {
						arg0.method4562(-18);
					} catch (@Pc(370) NullPointerException local370) {
						arg0.method4562(-19);
					} catch (@Pc(376) Exception local376) {
						arg0.method4562(-20);
					} catch (@Pc(382) Throwable local382) {
						arg0.method4562(-21);
					}
				} else {
					arg0.method4562(local15.anIntArray244[local106]);
				}
			}
			arg0.method4517(local99);
			arg0.method4566(arg0.anInt5182 - local99);
			local15.method5628();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2020(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static85.aCharArray6[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
					local70 = ' ';
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}
