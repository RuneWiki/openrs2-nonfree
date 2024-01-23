import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "[[Lclient!ob;")
	public static Class126[][] aClass126ArrayArray1;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "F")
	public static float aFloat56 = 0.0F;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public static int anInt1679 = 0;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString102 = "";

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	public static int anInt1689 = 0;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public static int anInt1690 = 0;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
	public static int[] anIntArray147 = new int[500];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V")
	public static void method1594(@OriginalArg(0) int arg0) {
		Static132.anInt3684 = -1;
		Static132.anInt3684 = -1;
		Static293.anInt5263 = arg0;
		Static257.method4079();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
	public static void method1595() {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(44) int local44;
		if (Static266.anInt4855 == 164) {
			local12 = Static13.aClass1_Sub14_Sub1_1.method1386();
			if (local12 == 65535) {
				local12 = -1;
			}
			local22 = Static13.aClass1_Sub14_Sub1_1.method1381();
			local30 = (local22 >> 4 & 0x7) + Static140.anInt5206;
			local36 = (local22 & 0x7) + Static201.anInt3867;
			local40 = Static13.aClass1_Sub14_Sub1_1.method1378();
			local44 = local40 & 0x3;
			local48 = local40 >> 2;
			local52 = Static28.anIntArray28[local48];
			Static120.method2143(Static65.anInt1300, local48, local52, local44, local30, local36, local12);
		} else if (Static266.anInt4855 == 73) {
			local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
			local22 = Static140.anInt5206 + (local12 >> 4 & 0x7);
			local30 = Static201.anInt3867 + (local12 & 0x7);
			local36 = Static13.aClass1_Sub14_Sub1_1.method1386();
			local40 = Static13.aClass1_Sub14_Sub1_1.method1378();
			local48 = Static13.aClass1_Sub14_Sub1_1.method1386();
			if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
				local30 = local30 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(146) Class15_Sub4 local146 = new Class15_Sub4(local36, Static65.anInt1300, local22, local30, Static69.method4275(local30, Static65.anInt1300, local22) - local40, local48, Static313.anInt2966);
				Static225.aClass59_32.method1706(new Class1_Sub2_Sub16(local146));
			}
		} else {
			@Pc(218) int local218;
			@Pc(222) int local222;
			@Pc(226) int local226;
			@Pc(230) int local230;
			@Pc(241) int local241;
			@Pc(320) Class15_Sub7 local320;
			if (Static266.anInt4855 == 3) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local22 = Static140.anInt5206 * 2 + (local12 >> 4 & 0xF);
				local30 = Static201.anInt3867 * 2 + (local12 & 0xF);
				local36 = Static13.aClass1_Sub14_Sub1_1.method1363() + local22;
				local40 = Static13.aClass1_Sub14_Sub1_1.method1363() + local30;
				local48 = Static13.aClass1_Sub14_Sub1_1.method1356();
				local44 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local52 = Static13.aClass1_Sub14_Sub1_1.method1378() * 4;
				local218 = Static13.aClass1_Sub14_Sub1_1.method1378() * 4;
				local222 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local226 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local230 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (local230 == 255) {
					local230 = -1;
				}
				local241 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (local22 >= 0 && local30 >= 0 && local22 < 208 && local30 < 208 && local36 >= 0 && local40 >= 0 && local36 < 208 && local40 < 208 && local44 != 65535) {
					local36 *= 64;
					local40 *= 64;
					local30 *= 64;
					local22 = local22 * 64;
					local320 = new Class15_Sub7(local44, Static65.anInt1300, local22, local30, Static69.method4275(local30, Static65.anInt1300, local22) - local52, Static313.anInt2966 + local222, Static313.anInt2966 + local226, local230, local241, local48, local218);
					local320.method4071(local36, Static313.anInt2966 + local222, -local218 + Static69.method4275(local40, Static65.anInt1300, local36), local40);
					Static35.aClass59_31.method1706(new Class1_Sub2_Sub24(local320));
				}
			} else if (Static266.anInt4855 == 149) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local30 = (local12 & 0x7) + Static201.anInt3867;
				local22 = (local12 >> 4 & 0x7) + Static140.anInt5206;
				local36 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local40 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local48 = Static13.aClass1_Sub14_Sub1_1.method1386();
				if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
					@Pc(408) Class59 local408 = Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local22][local30];
					if (local408 != null) {
						for (@Pc(416) Class1_Sub2_Sub14 local416 = (Class1_Sub2_Sub14) local408.method1704(); local416 != null; local416 = (Class1_Sub2_Sub14) local408.method1701()) {
							@Pc(422) Class15_Sub1 local422 = local416.aClass15_Sub1_1;
							if (local422.anInt339 == (local36 & 0x7FFF) && local40 == local422.anInt336) {
								local422.anInt336 = local48;
								break;
							}
						}
						Static143.method2465(local22, local30);
					}
				}
			} else if (Static266.anInt4855 == 153) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local22 = (local12 >> 4 & 0x7) + Static140.anInt5206;
				local30 = (local12 & 0x7) + Static201.anInt3867;
				local36 = Static13.aClass1_Sub14_Sub1_1.method1394();
				local40 = local36 >> 2;
				local44 = Static28.anIntArray28[local40];
				local48 = local36 & 0x3;
				if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
					Static310.method4731(local44, local48, -1, local22, 0, Static65.anInt1300, local40, local30, -1);
				}
			} else if (Static266.anInt4855 == 121) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1381();
				local22 = Static140.anInt5206 + (local12 >> 4 & 0x7);
				local30 = Static201.anInt3867 + (local12 & 0x7);
				local36 = Static13.aClass1_Sub14_Sub1_1.method1383();
				local40 = Static13.aClass1_Sub14_Sub1_1.method1383();
				if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
					@Pc(571) Class15_Sub1 local571 = new Class15_Sub1();
					local571.anInt339 = local36;
					local571.anInt336 = local40;
					if (Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local22][local30] == null) {
						Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local22][local30] = new Class59();
					}
					Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local22][local30].method1706(new Class1_Sub2_Sub14(local571));
					Static143.method2465(local22, local30);
				}
			} else if (Static266.anInt4855 == 188) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local30 = (local12 & 0x7) + Static201.anInt3867;
				local22 = (local12 >> 4 & 0x7) + Static140.anInt5206;
				local36 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local40 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local44 = local40 & 0x7;
				local48 = local40 >> 4 & 0xF;
				local52 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (local36 == 65535) {
					local36 = -1;
				}
				local218 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
					local222 = local48 + 1;
					if (Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] >= local22 - local222 && local22 + local222 >= Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] && local30 - local222 <= Static90.aClass15_Sub5_Sub2_2.anIntArray504[0] && local222 + local30 >= Static90.aClass15_Sub5_Sub2_2.anIntArray504[0] && Static294.anInt5275 != 0 && local44 > 0 && Static295.anInt5297 < 50 && local36 != -1) {
						Static179.anIntArray290[Static295.anInt5297] = local36;
						Static302.anIntArray470[Static295.anInt5297] = local44;
						Static69.anIntArray452[Static295.anInt5297] = local52;
						Static240.aClass169Array1[Static295.anInt5297] = null;
						Static142.anIntArray240[Static295.anInt5297] = local48 + (local30 << 8) + (local22 << 16);
						Static152.anIntArray42[Static295.anInt5297] = local218;
						Static295.anInt5297++;
					}
				}
			} else if (Static266.anInt4855 == 127) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local22 = Static140.anInt5206 + (local12 >> 4 & 0x7);
				local30 = Static201.anInt3867 + (local12 & 0x7);
				local36 = local22 + Static13.aClass1_Sub14_Sub1_1.method1363();
				local40 = local30 + Static13.aClass1_Sub14_Sub1_1.method1363();
				local48 = Static13.aClass1_Sub14_Sub1_1.method1356();
				local44 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local52 = Static13.aClass1_Sub14_Sub1_1.method1378() * 4;
				local218 = Static13.aClass1_Sub14_Sub1_1.method1378() * 4;
				local222 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local226 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local230 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (local230 == 255) {
					local230 = -1;
				}
				local241 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104 && local36 >= 0 && local40 >= 0 && local36 < 104 && local40 < 104 && local44 != 65535) {
					local36 = local36 * 128 + 64;
					local40 = local40 * 128 + 64;
					local30 = local30 * 128 + 64;
					local22 = local22 * 128 + 64;
					local320 = new Class15_Sub7(local44, Static65.anInt1300, local22, local30, Static69.method4275(local30, Static65.anInt1300, local22) - local52, Static313.anInt2966 + local222, Static313.anInt2966 + local226, local230, local241, local48, local218);
					local320.method4071(local36, local222 + Static313.anInt2966, -local218 + Static69.method4275(local40, Static65.anInt1300, local36), local40);
					Static35.aClass59_31.method1706(new Class1_Sub2_Sub24(local320));
				}
			} else if (Static266.anInt4855 == 182) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local22 = Static13.aClass1_Sub14_Sub1_1.method1378();
				Static255.method4052(local12).method2040(local22);
			} else if (Static266.anInt4855 == 36) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1366();
				local22 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local30 = Static13.aClass1_Sub14_Sub1_1.method1383();
				local36 = Static13.aClass1_Sub14_Sub1_1.method1394();
				local40 = Static140.anInt5206 + (local36 >> 4 & 0x7);
				local48 = (local36 & 0x7) + Static201.anInt3867;
				if (local40 >= 0 && local48 >= 0 && local40 < 104 && local48 < 104 && Static35.anInt3966 != local22) {
					@Pc(1073) Class15_Sub1 local1073 = new Class15_Sub1();
					local1073.anInt339 = local30;
					local1073.anInt336 = local12;
					if (Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local40][local48] == null) {
						Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local40][local48] = new Class59();
					}
					Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local40][local48].method1706(new Class1_Sub2_Sub14(local1073));
					Static143.method2465(local40, local48);
				}
			} else if (Static266.anInt4855 == 54) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1394();
				local22 = Static140.anInt5206 + (local12 >> 4 & 0x7);
				local30 = Static201.anInt3867 + (local12 & 0x7);
				local36 = Static13.aClass1_Sub14_Sub1_1.method1366();
				if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
					@Pc(1167) Class59 local1167 = Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local22][local30];
					if (local1167 != null) {
						for (@Pc(1176) Class1_Sub2_Sub14 local1176 = (Class1_Sub2_Sub14) local1167.method1704(); local1176 != null; local1176 = (Class1_Sub2_Sub14) local1167.method1701()) {
							if ((local36 & 0x7FFF) == local1176.aClass15_Sub1_1.anInt339) {
								local1176.method4779();
								break;
							}
						}
						if (local1167.method1704() == null) {
							Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local22][local30] = null;
						}
						Static143.method2465(local22, local30);
					}
				}
			} else if (Static266.anInt4855 == 135) {
				local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local30 = local12 & 0x3;
				local22 = local12 >> 2;
				local36 = Static28.anIntArray28[local22];
				local40 = Static13.aClass1_Sub14_Sub1_1.method1394();
				local44 = (local40 & 0x7) + Static201.anInt3867;
				local48 = Static140.anInt5206 + (local40 >> 4 & 0x7);
				local52 = Static13.aClass1_Sub14_Sub1_1.method1367();
				if (local48 >= 0 && local44 >= 0 && local48 < 104 && local44 < 104) {
					Static310.method4731(local36, local30, local52, local48, 0, Static65.anInt1300, local22, local44, -1);
				}
			} else {
				@Pc(1360) int local1360;
				if (Static266.anInt4855 == 101) {
					@Pc(1305) byte local1305 = Static13.aClass1_Sub14_Sub1_1.method1364();
					@Pc(1309) byte local1309 = Static13.aClass1_Sub14_Sub1_1.method1364();
					@Pc(1313) byte local1313 = Static13.aClass1_Sub14_Sub1_1.method1364();
					local36 = Static13.aClass1_Sub14_Sub1_1.method1383();
					@Pc(1321) byte local1321 = Static13.aClass1_Sub14_Sub1_1.method1371();
					local48 = Static13.aClass1_Sub14_Sub1_1.method1386();
					local44 = Static13.aClass1_Sub14_Sub1_1.method1336();
					local52 = Static13.aClass1_Sub14_Sub1_1.method1383();
					local218 = Static13.aClass1_Sub14_Sub1_1.method1394();
					local222 = Static140.anInt5206 + (local218 >> 4 & 0x7);
					local226 = (local218 & 0x7) + Static201.anInt3867;
					local230 = Static13.aClass1_Sub14_Sub1_1.method1381();
					local1360 = local230 & 0x3;
					local241 = local230 >> 2;
					if (!Static156.aBoolean211) {
						Static95.method1738(local1305, local226, local1321, local48, local52, local1309, local222, local241, local44, local1360, local1313, local36);
					}
				}
				if (Static266.anInt4855 == 205) {
					local12 = Static13.aClass1_Sub14_Sub1_1.method1378();
					local30 = (local12 & 0xF) + Static201.anInt3867 * 2;
					local22 = Static140.anInt5206 * 2 + (local12 >> 4 & 0xF);
					local36 = local22 + Static13.aClass1_Sub14_Sub1_1.method1363();
					local40 = Static13.aClass1_Sub14_Sub1_1.method1363() + local30;
					local48 = Static13.aClass1_Sub14_Sub1_1.method1356();
					local44 = Static13.aClass1_Sub14_Sub1_1.method1356();
					local52 = Static13.aClass1_Sub14_Sub1_1.method1386();
					local218 = Static13.aClass1_Sub14_Sub1_1.method1363();
					local222 = Static13.aClass1_Sub14_Sub1_1.method1378() * 4;
					local226 = Static13.aClass1_Sub14_Sub1_1.method1386();
					local230 = Static13.aClass1_Sub14_Sub1_1.method1386();
					local241 = Static13.aClass1_Sub14_Sub1_1.method1378();
					local1360 = Static13.aClass1_Sub14_Sub1_1.method1378();
					if (local241 == 255) {
						local241 = -1;
					}
					if (local22 >= 0 && local30 >= 0 && local22 < 208 && local30 < 208 && local36 >= 0 && local40 >= 0 && local36 < 208 && local40 < 208 && local52 != 65535) {
						local36 = local36 * 64;
						local22 = local22 * 64;
						local40 *= 64;
						local30 = local30 * 64;
						if (local48 != 0) {
							@Pc(1541) int local1541;
							@Pc(1556) Class15_Sub5 local1556;
							@Pc(1535) int local1535;
							@Pc(1545) int local1545;
							if (local48 < 0) {
								local1535 = -local48 - 1;
								local1541 = local1535 >> 11 & 0xF;
								local1545 = local1535 & 0x7FF;
								if (Static35.anInt3966 == local1545) {
									local1556 = Static90.aClass15_Sub5_Sub2_2;
								} else {
									local1556 = Static17.aClass15_Sub5_Sub2Array1[local1545];
								}
							} else {
								local1535 = local48 - 1;
								local1541 = local1535 >> 11 & 0xF;
								local1545 = local1535 & 0x7FF;
								local1556 = Static83.aClass15_Sub5_Sub1Array1[local1545];
							}
							if (local1556 != null) {
								@Pc(1587) Class11 local1587 = local1556.method4698();
								if (local1587.anIntArrayArray3 != null && local1587.anIntArrayArray3[local1541] != null) {
									local218 -= local1587.anIntArrayArray3[local1541][1];
									local1545 = local1587.anIntArrayArray3[local1541][0];
									@Pc(1619) int local1619 = Class135.anIntArray335[local1556.anInt5554];
									@Pc(1626) int local1626 = local1587.anIntArrayArray3[local1541][2];
									@Pc(1631) int local1631 = Class135.anIntArray338[local1556.anInt5554];
									@Pc(1642) int local1642 = local1626 * local1619 + local1545 * local1631 >> 16;
									@Pc(1652) int local1652 = local1626 * local1631 - local1619 * local1545 >> 16;
									local30 += local1652;
									local22 += local1642;
								}
							}
						}
						@Pc(1689) Class15_Sub7 local1689 = new Class15_Sub7(local52, Static65.anInt1300, local22, local30, Static69.method4275(local30, Static65.anInt1300, local22) - local218, local226 - -Static313.anInt2966, local230 + Static313.anInt2966, local241, local1360, local44, local222);
						local1689.method4071(local36, local226 + Static313.anInt2966, Static69.method4275(local40, Static65.anInt1300, local36) + -local222, local40);
						Static35.aClass59_31.method1706(new Class1_Sub2_Sub24(local1689));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
	public static void method1596() {
		Static226.aString234 = "jaune:";
		Static162.aString180 = "Fermer";
		Static175.aString197 = "Chargement de la liste des serveurs";
		Static61.aString75 = "tremblement:";
		Static199.aString212 = "Prendre";
		Static218.aString71 = "Librairie 3D démarrée";
		Static315.aString312 = "Votre liste noire est pleine (100 noms maximum).";
		Static180.aString200 = "Chargement en cours. Veuillez patienter.";
		Static117.aString140 = "Annuler";
		Static131.aString150 = "brillant2:";
		Static82.aString99 = "Chargement en cours...";
		Static313.aString168 = "Connexion perdue.";
		Static115.aString137 = " de votre liste d'amis.";
		Static237.aString246 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
		Static123.aString143 = "brillant1:";
		Static47.aString52 = " autres options";
		Static86.aString103 = "Chargement des interfaces - ";
		Static196.aString209 = "Chargement des sprites - ";
		Static52.aString337 = "Chargement des polices - ";
		Static240.aString248 = "Vérification des mises à jour - ";
		Static245.aString258 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
		Static285.aString306 = "Veuillez commencer par supprimer ";
		Static308.aString334 = "Atteindre";
		Static190.aString206 = "Écran-titre chargé";
		Static245.aString259 = "Sprites chargés";
		Static269.aString142 = "Monde de jeu créé";
		Static72.aString329 = "cyan:";
		Static229.aString238 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
		Static296.aString320 = "Examiner";
		Static290.aString309 = "Sélectionner";
		Static108.aString129 = "Impossible de trouver ";
		Static54.aString62 = "Veuillez patienter - tentative de rétablissement.";
		Static176.aString198 = "Textures chargées";
		Static207.aString221 = " ";
		Static280.aString300 = "Regarder dans cette direction";
		Static235.aString317 = "Mémoire attribuée";
		Static56.aString64 = " est déjà dans votre liste d'amis.";
		Static252.aString270 = "ondulation:";
		Static170.aString192 = "déroulement:";
		Static12.aString18 = "niveau ";
		Static279.aString295 = "classement ";
		Static266.aString285 = "M";
		Static290.aString310 = "Objet d'abonnés";
		Static240.aString249 = "Interfaces chargées";
		Static20.aString24 = "vert:";
		Static239.aString247 = " est déjà dans votre liste noire.";
		Static151.aString165 = "ondulation2:";
		Static71.aString87 = "Paramètres par défaut chargés";
		Static12.aString17 = "Démarrage de la librairie 3D";
		Static40.aString322 = "OK";
		Static192.aString208 = "clignotant3:";
		Static202.aString214 = "Connexion au serveur de mise à jour en cours";
		Static209.aString223 = "Écran-titre ouvert";
		Static174.aString196 = "Mémoire en cours d'attribution";
		Static229.aString237 = "Veuillez patienter...";
		Static126.aString109 = "clignotant1:";
		Static110.aString130 = "K";
		Static282.aString302 = " s'est connecté.";
		Static293.aString315 = " s'est déconnecté.";
		Static234.aString240 = "Chargement de RuneScape en cours - veuillez patienter...";
		Static203.aString216 = "voudrait faire un échange avec vous.";
		Static66.aString244 = "Chargement de l'écran-titre - ";
		Static242.aString252 = "M";
		Static296.aString319 = "compétence ";
		Static244.aString255 = "Choisir une option";
		Static72.aString328 = "violet:";
		Static237.aString245 = "Chargement des fichiers config - ";
		Static181.aString201 = " de votre liste noire.";
		Static300.aString326 = "Moteur son préparé";
		Static173.aString193 = "Liste des mises à jour chargée";
		Static218.aString70 = "blanc:";
		Static103.aString118 = "Chargement du module texte - ";
		Static307.aString332 = "Liste des serveurs chargée";
		Static210.aString226 = "brillant3:";
		Static311.aString339 = "Continuer";
		Static35.aString222 = "Utiliser";
		Static16.aString341 = "Caché";
		Static2.aString4 = "Chargement des textures - ";
		Static63.aString183 = "Poser";
		Static225.aString233 = "Attaquer";
		Static79.aString96 = "Gestionnaire de saisie chargé";
		Static4.aString6 = "Veuillez commencer par supprimer ";
		Static262.aString283 = "glissement:";
		Static3.aString5 = "Connecté au serveur de mise à jour";
		Static26.aString31 = "Chargement des paramètres par défaut - ";
		Static167.aString187 = "clignotant2:";
		Static116.aString139 = "Jeter";
		Static153.aString171 = "K";
		Static274.aString290 = "rouge:";
		Static135.aString155 = "Chargement de Mechscape en cours - veuillez patienter...";
		Static290.aString308 = "Module texte chargé";
		Static56.aString65 = "Polices chargées";
		Static253.aString274 = "Fichiers config chargés";
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)Z")
	public static boolean method1597(@OriginalArg(1) int arg0) {
		if (Static83.aBooleanArray5[arg0]) {
			return true;
		} else if (Static263.aClass121_117.method3133(arg0)) {
			@Pc(30) int local30 = Static263.aClass121_117.method3125(arg0);
			if (local30 == 0) {
				Static83.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static274.aClass66ArrayArray1[arg0] == null) {
				Static274.aClass66ArrayArray1[arg0] = new Class66[local30];
			}
			for (@Pc(53) int local53 = 0; local53 < local30; local53++) {
				if (Static274.aClass66ArrayArray1[arg0][local53] == null) {
					@Pc(73) byte[] local73 = Static263.aClass121_117.method3115(arg0, local53);
					if (local73 != null) {
						@Pc(86) Class66 local86 = Static274.aClass66ArrayArray1[arg0][local53] = new Class66();
						local86.anInt2157 = (arg0 << 16) + local53;
						if (local73[0] == -1) {
							local86.method1916(new Class1_Sub14(local73));
						} else {
							local86.method1921(new Class1_Sub14(local73));
						}
					}
				}
			}
			Static83.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
