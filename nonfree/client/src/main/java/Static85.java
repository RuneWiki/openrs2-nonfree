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

public final class Static85 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public static int anInt1402;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!wd;B)V")
	public static void method1340(@OriginalArg(0) Class5_Sub12_Sub2 arg0) {
		@Pc(10) Class5_Sub42 local10 = (Class5_Sub42) Static35.aClass306_7.method7313();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt7484; local17++) {
			if (local10.aClass330Array1[local17] != null) {
				if (local10.aClass330Array1[local17].anInt9132 == 2) {
					local10.anIntArray601[local17] = -5;
				}
				if (local10.aClass330Array1[local17].anInt9132 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass330Array2[local17] != null) {
				if (local10.aClass330Array2[local17].anInt9132 == 2) {
					local10.anIntArray601[local17] = -6;
				}
				if (local10.aClass330Array2[local17].anInt9132 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(94) int local94 = arg0.anInt10154;
		arg0.method8622(local10.anInt7485);
		for (@Pc(101) int local101 = 0; local101 < local10.anInt7484; local101++) {
			if (local10.anIntArray601[local101] == 0) {
				try {
					@Pc(125) int local125 = local10.anIntArray600[local101];
					@Pc(137) Field local137;
					@Pc(141) int local141;
					if (local125 == 0) {
						local137 = (Field) local10.aClass330Array1[local101].anObject19;
						local141 = local137.getInt((Object) null);
						arg0.method8647(0);
						arg0.method8622(local141);
					} else if (local125 == 1) {
						local137 = (Field) local10.aClass330Array1[local101].anObject19;
						local137.setInt((Object) null, local10.anIntArray602[local101]);
						arg0.method8647(0);
					} else if (local125 == 2) {
						local137 = (Field) local10.aClass330Array1[local101].anObject19;
						local141 = local137.getModifiers();
						arg0.method8647(0);
						arg0.method8622(local141);
					}
					@Pc(208) Method local208;
					if (local125 == 3) {
						local208 = (Method) local10.aClass330Array2[local101].anObject19;
						@Pc(233) byte[][] local233 = local10.aByteArrayArrayArray20[local101];
						@Pc(237) Object[] local237 = new Object[local233.length];
						for (@Pc(239) int local239 = 0; local239 < local233.length; local239++) {
							@Pc(251) ObjectInputStream local251 = new ObjectInputStream(new ByteArrayInputStream(local233[local239]));
							local237[local239] = local251.readObject();
						}
						@Pc(270) Object local270 = local208.invoke((Object) null, local237);
						if (local270 == null) {
							arg0.method8647(0);
						} else if (local270 instanceof Number) {
							arg0.method8647(1);
							arg0.method8653(((Number) local270).longValue());
						} else if (local270 instanceof String) {
							arg0.method8647(2);
							arg0.method8619((String) local270);
						} else {
							arg0.method8647(4);
						}
					} else if (local125 == 4) {
						local208 = (Method) local10.aClass330Array2[local101].anObject19;
						local141 = local208.getModifiers();
						arg0.method8647(0);
						arg0.method8622(local141);
					}
				} catch (@Pc(313) ClassNotFoundException local313) {
					arg0.method8647(-10);
				} catch (@Pc(319) InvalidClassException local319) {
					arg0.method8647(-11);
				} catch (@Pc(325) StreamCorruptedException local325) {
					arg0.method8647(-12);
				} catch (@Pc(331) OptionalDataException local331) {
					arg0.method8647(-13);
				} catch (@Pc(337) IllegalAccessException local337) {
					arg0.method8647(-14);
				} catch (@Pc(343) IllegalArgumentException local343) {
					arg0.method8647(-15);
				} catch (@Pc(349) InvocationTargetException local349) {
					arg0.method8647(-16);
				} catch (@Pc(355) SecurityException local355) {
					arg0.method8647(-17);
				} catch (@Pc(361) IOException local361) {
					arg0.method8647(-18);
				} catch (@Pc(367) NullPointerException local367) {
					arg0.method8647(-19);
				} catch (@Pc(373) Exception local373) {
					arg0.method8647(-20);
				} catch (@Pc(379) Throwable local379) {
					arg0.method8647(-21);
				}
			} else {
				arg0.method8647(local10.anIntArray601[local101]);
			}
		}
		arg0.method8632(local94);
		local10.method8911();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)I")
	public static int method1341(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	public static boolean method1342(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method1343() {
		@Pc(7) String local7 = "www";
		if (Static34.aClass346_2 == Static317.aClass346_3) {
			local7 = "www-wtrc";
		} else if (Static601.aClass346_7 == Static34.aClass346_2) {
			local7 = "www-wtqa";
		} else if (Static383.aClass346_5 == Static34.aClass346_2) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static604.aString143 != null) {
			local28 = "/p=" + Static604.aString143;
		}
		return "http://" + local7 + "." + Static24.aClass235_1.aString101 + ".com/l=" + Static321.anInt5554 + "/a=" + Static141.anInt2321 + local28 + "/";
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method1345() {
		if (Static627.aClass5_Sub46_31.aClass11_Sub8_2.method2214() != 2) {
			return;
		}
		@Pc(25) byte local25 = (byte) (Static92.anInt9992 - 4 & 0xFF);
		@Pc(29) int local29 = Static92.anInt9992 % Static111.anInt1752;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static279.anInt4567; local35++) {
				Static479.aByteArrayArrayArray21[local31][local29][local35] = local25;
			}
		}
		if (Static299.anInt4751 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static352.anIntArray488[local35] = -1000000;
			Static200.anIntArray291[local35] = 1000000;
			Static368.anIntArray509[local35] = 0;
			Static131.anIntArray174[local35] = 1000000;
			Static606.anIntArray803[local35] = 0;
		}
		@Pc(96) int local96 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317;
		@Pc(99) int local99 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
		@Pc(151) int local151;
		if (Static584.anInt9543 != 1 && Static394.anInt6873 == -1) {
			local151 = Static600.method8378(Static646.anInt10445, Static70.anInt9231, Static299.anInt4751);
			if (local151 - Static216.anInt3726 < 3200 && (Static480.aByteArrayArrayArray19[Static299.anInt4751][Static70.anInt9231 >> 9][Static646.anInt10445 >> 9] & 0x4) != 0) {
				Static649.method8907(1, Static646.anInt10445 >> 9, false, Static70.anInt9231 >> 9, Static535.aClass156ArrayArrayArray2);
				return;
			}
			return;
		}
		if (Static584.anInt9543 != 1) {
			local96 = Static394.anInt6873;
			local99 = Static609.anInt9978;
		}
		if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][local96 >> 9][local99 >> 9] & 0x4) != 0) {
			Static649.method8907(0, local99 >> 9, false, local96 >> 9, Static535.aClass156ArrayArrayArray2);
		}
		if (Static218.anInt3744 >= 2560) {
			return;
		}
		local151 = Static70.anInt9231 >> 9;
		@Pc(155) int local155 = Static646.anInt10445 >> 9;
		@Pc(159) int local159 = local96 >> 9;
		@Pc(163) int local163 = local99 >> 9;
		@Pc(175) int local175;
		if (local159 > local151) {
			local175 = local159 - local151;
		} else {
			local175 = local151 - local159;
		}
		@Pc(193) int local193;
		if (local163 <= local155) {
			local193 = local155 - local163;
		} else {
			local193 = local163 - local155;
		}
		if ((local175 != 0 || local193 != 0) && (-Static111.anInt1752) < local175 && local175 < Static111.anInt1752 && local193 > -Static279.anInt4567 && Static279.anInt4567 > local193) {
			@Pc(272) int local272;
			@Pc(274) int local274;
			if (local193 >= local175) {
				local272 = local175 * 65536 / local193;
				local274 = 32768;
				while (local163 != local155) {
					if (local155 < local163) {
						local155++;
					} else if (local163 < local155) {
						local155--;
					}
					if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][local151][local155] & 0x4) != 0) {
						Static649.method8907(1, local155, false, local151, Static535.aClass156ArrayArrayArray2);
						return;
					}
					local274 += local272;
					if (local274 >= 65536) {
						if (local151 < local159) {
							local151++;
						} else if (local151 > local159) {
							local151--;
						}
						local274 -= 65536;
						if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][local151][local155] & 0x4) != 0) {
							Static649.method8907(1, local155, false, local151, Static535.aClass156ArrayArrayArray2);
							return;
						}
					}
				}
				return;
			}
			local272 = local193 * 65536 / local175;
			local274 = 32768;
			while (local151 != local159) {
				if (local159 > local151) {
					local151++;
				} else if (local151 > local159) {
					local151--;
				}
				if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][local151][local155] & 0x4) != 0) {
					Static649.method8907(1, local155, false, local151, Static535.aClass156ArrayArrayArray2);
					return;
				}
				local274 += local272;
				if (local274 >= 65536) {
					local274 -= 65536;
					if (local163 > local155) {
						local155++;
					} else if (local155 > local163) {
						local155--;
					}
					if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][local151][local155] & 0x4) != 0) {
						Static649.method8907(1, local155, false, local151, Static535.aClass156ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		Static280.method4194("RC: " + local151 + "," + local155 + " " + local159 + "," + local163 + " " + Static113.anInt1785 + "," + Static622.anInt10087, (Throwable) null);
		return;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
