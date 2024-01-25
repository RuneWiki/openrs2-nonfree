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

public final class Static98 {

	@OriginalMember(owner = "client!fg", name = "fb", descriptor = "Lclient!ui;")
	public static Class230 aClass230_32;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	public static int anInt1774 = 100;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString13 = null;

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "S")
	public static short aShort29 = 32767;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_40 = new Class211(57, 12);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!ng;B)V")
	public static void method1453(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class162 arg3) {
		if (!arg0) {
			Static24.method370(arg1, arg3, 3);
			return;
		}
		@Pc(24) String local24;
		if (Static237.aString47.startsWith("win") && Static237.anInt3958 != 3) {
			local24 = null;
			if (arg3.anApplet1 != null) {
				local24 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class112 local44 = Static24.method370(arg1, arg3, 0);
				Static213.aString44 = arg1;
				Static79.aClass112_2 = local44;
				Static150.aClass162_2 = arg3;
				return;
			}
		}
		if (Static237.aString47.startsWith("mac")) {
			local24 = null;
			if (arg3.anApplet1 != null) {
				local24 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg2) {
				Static24.method370(arg1, arg3, 1);
				return;
			}
		}
		Static24.method370(arg1, arg3, 2);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!vg;B)V")
	public static void method1454(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub33_Sub2 arg1) {
		while (true) {
			@Pc(18) Class1_Sub36 local18 = (Class1_Sub36) Static8.aClass17_1.method202();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt4595; local25++) {
				if (local18.aClass112Array2[local25] != null) {
					if (local18.aClass112Array2[local25].anInt2969 == 2) {
						local18.anIntArray564[local25] = -5;
					}
					if (local18.aClass112Array2[local25].anInt2969 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass112Array1[local25] != null) {
					if (local18.aClass112Array1[local25].anInt2969 == 2) {
						local18.anIntArray564[local25] = -6;
					}
					if (local18.aClass112Array1[local25].anInt2969 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method5198(arg0);
			arg1.method5165(0);
			@Pc(105) int local105 = arg1.lb;
			arg1.method5142(local18.anInt4593);
			for (@Pc(112) int local112 = 0; local112 < local18.anInt4595; local112++) {
				if (local18.anIntArray564[local112] == 0) {
					try {
						@Pc(136) int local136 = local18.anIntArray566[local112];
						@Pc(156) Field local156;
						@Pc(159) int local159;
						if (local136 == 0) {
							local156 = (Field) local18.aClass112Array2[local112].anObject5;
							local159 = local156.getInt(null);
							arg1.method5165(0);
							arg1.method5142(local159);
						} else if (local136 == 1) {
							local156 = (Field) local18.aClass112Array2[local112].anObject5;
							local156.setInt(null, local18.anIntArray565[local112]);
							arg1.method5165(0);
						} else if (local136 == 2) {
							local156 = (Field) local18.aClass112Array2[local112].anObject5;
							local159 = local156.getModifiers();
							arg1.method5165(0);
							arg1.method5142(local159);
						}
						@Pc(218) Method local218;
						if (local136 == 3) {
							local218 = (Method) local18.aClass112Array1[local112].anObject5;
							@Pc(223) byte[][] local223 = local18.aByteArrayArrayArray15[local112];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg1.method5165(0);
							} else if (local260 instanceof Number) {
								arg1.method5165(1);
								arg1.method5127(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg1.method5165(2);
								arg1.method5143((String) local260);
							} else {
								arg1.method5165(4);
							}
						} else if (local136 == 4) {
							local218 = (Method) local18.aClass112Array1[local112].anObject5;
							local159 = local218.getModifiers();
							arg1.method5165(0);
							arg1.method5142(local159);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg1.method5165(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg1.method5165(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg1.method5165(-12);
					} catch (@Pc(346) OptionalDataException local346) {
						arg1.method5165(-13);
					} catch (@Pc(352) IllegalAccessException local352) {
						arg1.method5165(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg1.method5165(-15);
					} catch (@Pc(364) InvocationTargetException local364) {
						arg1.method5165(-16);
					} catch (@Pc(370) SecurityException local370) {
						arg1.method5165(-17);
					} catch (@Pc(376) IOException local376) {
						arg1.method5165(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg1.method5165(-19);
					} catch (@Pc(388) Exception local388) {
						arg1.method5165(-20);
					} catch (@Pc(394) Throwable local394) {
						arg1.method5165(-21);
					}
				} else {
					arg1.method5165(local18.anIntArray564[local112]);
				}
			}
			arg1.method5133(local105);
			arg1.method5149(arg1.lb - local105);
			local18.method5577();
		}
	}
}
