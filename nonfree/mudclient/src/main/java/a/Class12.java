package a;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/g")
public final class Class12 {

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "Z")
	private static boolean aBoolean46;

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "Z")
	private static boolean aBoolean47;

	@OriginalMember(owner = "mudclient!a/g", name = "e", descriptor = "[I")
	private static int[] anIntArray96;

	@OriginalMember(owner = "mudclient!a/g", name = "f", descriptor = "[[C")
	private static char[][] aCharArrayArray1;

	@OriginalMember(owner = "mudclient!a/g", name = "g", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "mudclient!a/g", name = "h", descriptor = "[[C")
	private static char[][] aCharArrayArray2;

	@OriginalMember(owner = "mudclient!a/g", name = "i", descriptor = "[[[B")
	private static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "mudclient!a/g", name = "j", descriptor = "[[C")
	private static char[][] aCharArrayArray3;

	@OriginalMember(owner = "mudclient!a/g", name = "k", descriptor = "[I")
	private static int[] anIntArray97;

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "Z")
	private static boolean aBoolean48 = true;

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "I")
	private static int anInt273 = 3;

	@OriginalMember(owner = "mudclient!a/g", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray3 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Lmudclient!a/d;Lmudclient!a/d;Lmudclient!a/d;Lmudclient!a/d;)V")
	public static void method321(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class10 arg3) {
		method323(arg1);
		method324(arg2);
		method325(arg0);
		method322(arg3);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Lmudclient!a/d;)V")
	private static void method322(@OriginalArg(0) Class10 arg0) {
		@Pc(4) int local4 = arg0.method301();
		aCharArrayArray3 = new char[local4][];
		anIntArray97 = new int[local4];
		for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
			anIntArray97[local12] = arg0.method299();
			@Pc(23) char[] local23 = new char[arg0.method299()];
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				local23[local25] = (char) arg0.method299();
			}
			aCharArrayArray3[local12] = local23;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "(Lmudclient!a/d;)V")
	private static void method323(@OriginalArg(0) Class10 arg0) {
		@Pc(2) int local2 = arg0.method301();
		aCharArrayArray1 = new char[local2][];
		aByteArrayArrayArray1 = new byte[local2][][];
		method326(arg0, aCharArrayArray1, aByteArrayArrayArray1);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "(Lmudclient!a/d;)V")
	private static void method324(@OriginalArg(0) Class10 arg0) {
		@Pc(2) int local2 = arg0.method301();
		aCharArrayArray2 = new char[local2][];
		aByteArrayArrayArray2 = new byte[local2][][];
		method326(arg0, aCharArrayArray2, aByteArrayArrayArray2);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "(Lmudclient!a/d;)V")
	private static void method325(@OriginalArg(0) Class10 arg0) {
		anIntArray96 = new int[arg0.method301()];
		for (@Pc(5) int local5 = 0; local5 < anIntArray96.length; local5++) {
			anIntArray96[local5] = arg0.method300();
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Lmudclient!a/d;[[C[[[B)V")
	private static void method326(@OriginalArg(0) Class10 arg0, @OriginalArg(1) char[][] arg1, @OriginalArg(2) byte[][][] arg2) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) char[] local9 = new char[arg0.method299()];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				local9[local11] = (char) arg0.method299();
			}
			arg1[local3] = local9;
			@Pc(33) byte[][] local33 = new byte[arg0.method301()][2];
			for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
				local33[local35][0] = (byte) arg0.method299();
				local33[local35][1] = (byte) arg0.method299();
			}
			if (local33.length > 0) {
				arg2[local3] = local33;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method327(@OriginalArg(0) String arg0) {
		@Pc(5) char[] local5 = arg0.toLowerCase().toCharArray();
		method332(local5);
		method330(local5);
		method331(local5);
		method341(local5);
		for (@Pc(15) int local15 = 0; local15 < aStringArray3.length; local15++) {
			@Pc(19) int local19 = -1;
			while ((local19 = arg0.indexOf(aStringArray3[local15], local19 + 1)) != -1) {
				@Pc(26) char[] local26 = aStringArray3[local15].toCharArray();
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					local5[local28 + local19] = local26[local28];
				}
			}
		}
		if (aBoolean48) {
			method328(arg0.toCharArray(), local5);
			method329(local5);
		}
		return new String(local5);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[C)V")
	private static void method328(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg1[local1] != '*' && method349(arg0[local1])) {
				arg1[local1] = arg0[local1];
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C)V")
	private static void method329(@OriginalArg(0) char[] arg0) {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(11) char local11 = arg0[local5];
			if (!method346(local11)) {
				local3 = true;
			} else if (local3) {
				if (method348(local11)) {
					local3 = false;
				}
			} else if (method349(local11)) {
				arg0[local5] = (char) (local11 + 'a' - 65);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "([C)V")
	private static void method330(@OriginalArg(0) char[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			for (@Pc(10) int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
				method336(arg0, aCharArrayArray1[local10], aByteArrayArrayArray1[local10]);
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "([C)V")
	private static void method331(@OriginalArg(0) char[] arg0) {
		for (@Pc(4) int local4 = aCharArrayArray2.length - 1; local4 >= 0; local4--) {
			method336(arg0, aCharArrayArray2[local4], aByteArrayArrayArray2[local4]);
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "([C)V")
	private static void method332(@OriginalArg(0) char[] arg0) {
		@Pc(3) char[] local3 = (char[]) arg0.clone();
		@Pc(18) char[] local18 = new char[] { 'd', 'o', 't' };
		method336(local3, local18, null);
		@Pc(26) char[] local26 = (char[]) arg0.clone();
		@Pc(49) char[] local49 = new char[] { 's', 'l', 'a', 's', 'h' };
		method336(local26, local49, null);
		for (@Pc(55) int local55 = 0; local55 < aCharArrayArray3.length; local55++) {
			method333(arg0, local3, local26, aCharArrayArray3[local55], anIntArray97[local55]);
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[C[C[CI)V")
	private static void method333(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) char[] arg2, @OriginalArg(3) char[] arg3, @OriginalArg(4) int arg4) {
		if (arg3.length > arg0.length) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 <= arg0.length - arg3.length; local9++) {
			@Pc(13) int local13 = local9;
			@Pc(15) int local15 = 0;
			label120: while (true) {
				while (true) {
					if (local13 >= arg0.length) {
						break label120;
					}
					@Pc(23) char local23 = arg0[local13];
					@Pc(25) char local25 = 0;
					if (local13 + 1 < arg0.length) {
						local25 = arg0[local13 + 1];
					}
					@Pc(49) int local49;
					if (local15 < arg3.length && (local49 = method338(arg3[local15], local23, local25)) > 0) {
						local13 += local49;
						local15++;
					} else {
						if (local15 == 0) {
							break label120;
						}
						@Pc(69) int local69;
						if ((local69 = method338(arg3[local15 - 1], local23, local25)) > 0) {
							local13 += local69;
						} else {
							if (local15 >= arg3.length || !method344(local23)) {
								break label120;
							}
							local13++;
						}
					}
				}
			}
			if (local15 >= arg3.length) {
				@Pc(95) boolean local95 = false;
				@Pc(100) int local100 = method334(arg0, arg1, local9);
				@Pc(107) int local107 = method335(arg0, arg2, local13 - 1);
				if (aBoolean46) {
					System.out.println("Potential tld: " + arg3 + " at char " + local9 + " (type=" + arg4 + ", startmatch=" + local100 + ", endmatch=" + local107 + ")");
				}
				if (arg4 == 1 && local100 > 0 && local107 > 0) {
					local95 = true;
				}
				if (arg4 == 2 && (local100 > 2 && local107 > 0 || local100 > 0 && local107 > 2)) {
					local95 = true;
				}
				if (arg4 == 3 && local100 > 0 && local107 > 2) {
					local95 = true;
				}
				@Pc(179) boolean local179;
				if (arg4 == 3 && local100 > 2 && local107 > 0) {
					local179 = true;
				} else {
					local179 = false;
				}
				if (local95) {
					if (aBoolean46) {
						System.out.println("Filtered tld: " + arg3 + " at char " + local9);
					}
					@Pc(201) int local201 = local9;
					@Pc(205) int local205 = local13 - 1;
					@Pc(213) boolean local213;
					@Pc(217) int local217;
					if (local100 > 2) {
						if (local100 == 4) {
							local213 = false;
							for (local217 = local9 - 1; local217 >= 0; local217--) {
								if (local213) {
									if (arg1[local217] != '*') {
										break;
									}
									local201 = local217;
								} else if (arg1[local217] == '*') {
									local201 = local217;
									local213 = true;
								}
							}
						}
						local213 = false;
						for (local217 = local201 - 1; local217 >= 0; local217--) {
							if (local213) {
								if (method344(arg0[local217])) {
									break;
								}
								local201 = local217;
							} else if (!method344(arg0[local217])) {
								local213 = true;
								local201 = local217;
							}
						}
					}
					if (local107 > 2) {
						if (local107 == 4) {
							local213 = false;
							for (local217 = local205 + 1; local217 < arg0.length; local217++) {
								if (local213) {
									if (arg2[local217] != '*') {
										break;
									}
									local205 = local217;
								} else if (arg2[local217] == '*') {
									local205 = local217;
									local213 = true;
								}
							}
						}
						local213 = false;
						for (local217 = local205 + 1; local217 < arg0.length; local217++) {
							if (local213) {
								if (method344(arg0[local217])) {
									break;
								}
								local205 = local217;
							} else if (!method344(arg0[local217])) {
								local213 = true;
								local205 = local217;
							}
						}
					}
					for (@Pc(347) int local347 = local201; local347 <= local205; local347++) {
						arg0[local347] = '*';
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[CI)I")
	private static int method334(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return 2;
		}
		@Pc(9) int local9 = arg2 - 1;
		while (true) {
			if (local9 >= 0 && method344(arg0[local9])) {
				if (arg0[local9] != ',' && arg0[local9] != '.') {
					local9--;
					continue;
				}
				return 3;
			}
			@Pc(33) int local33 = 0;
			for (@Pc(37) int local37 = arg2 - 1; local37 >= 0 && method344(arg1[local37]); local37--) {
				if (arg1[local37] == '*') {
					local33++;
				}
			}
			if (local33 >= 3) {
				return 4;
			}
			if (method344(arg0[arg2 - 1])) {
				return 1;
			}
			return 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "([C[CI)I")
	private static int method335(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 + 1 == arg0.length) {
			return 2;
		}
		@Pc(13) int local13 = arg2 + 1;
		while (true) {
			if (local13 < arg0.length && method344(arg0[local13])) {
				if (arg0[local13] != '\\' && arg0[local13] != '/') {
					local13++;
					continue;
				}
				return 3;
			}
			@Pc(39) int local39 = 0;
			for (@Pc(43) int local43 = arg2 + 1; local43 < arg0.length && method344(arg1[local43]); local43++) {
				if (arg1[local43] == '*') {
					local39++;
				}
			}
			if (local39 >= 5) {
				return 4;
			}
			if (method344(arg0[arg2 + 1])) {
				return 1;
			}
			return 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([C[C[[B)V")
	private static void method336(@OriginalArg(0) char[] arg0, @OriginalArg(1) char[] arg1, @OriginalArg(2) byte[][] arg2) {
		if (arg1.length > arg0.length) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 <= arg0.length - arg1.length; local9++) {
			@Pc(13) int local13 = local9;
			@Pc(15) int local15 = 0;
			@Pc(17) boolean local17 = false;
			@Pc(25) char var8;
			@Pc(27) char var9;
			label118: while (true) {
				while (true) {
					if (local13 >= arg0.length) {
						break label118;
					}
					var8 = arg0[local13];
					var9 = '\u0000';
					if (local13 + 1 < arg0.length) {
						var9 = arg0[local13 + 1];
					}
					@Pc(51) int local51;
					if (local15 < arg1.length && (local51 = method339(arg1[local15], var8, var9)) > 0) {
						local13 += local51;
						local15++;
					} else {
						if (local15 == 0) {
							break label118;
						}
						@Pc(71) int local71;
						if ((local71 = method339(arg1[local15 - 1], var8, var9)) > 0) {
							local13 += local71;
						} else {
							if (local15 >= arg1.length || !method345(var8)) {
								break label118;
							}
							if (method344(var8) && var8 != '\'') {
								local17 = true;
							}
							local13++;
						}
					}
				}
			}
			if (local15 >= arg1.length) {
				@Pc(105) boolean local105 = true;
				if (aBoolean46) {
					System.out.println("Potential word: " + arg1 + " at char " + local9);
				}
				if (local17) {
					@Pc(163) boolean local163 = false;
					@Pc(165) boolean local165 = false;
					if (local9 - 1 < 0 || method344(arg0[local9 - 1]) && arg0[local9 - 1] != '\'') {
						local163 = true;
					}
					if (local13 >= arg0.length || method344(arg0[local13]) && arg0[local13] != '\'') {
						local165 = true;
					}
					if (!local163 || !local165) {
						@Pc(207) boolean local207 = false;
						@Pc(211) int local211 = local9 - 2;
						if (local163) {
							local211 = local9;
						}
						while (!local207 && local211 < local13) {
							if (local211 >= 0 && (!method344(arg0[local211]) || arg0[local211] == '\'')) {
								@Pc(232) char[] local232 = new char[3];
								@Pc(234) int local234;
								for (local234 = 0; local234 < 3 && local211 + local234 < arg0.length && (!method344(arg0[local211 + local234]) || arg0[local211 + local234] == '\''); local234++) {
									local232[local234] = arg0[local211 + local234];
								}
								@Pc(271) boolean local271 = true;
								if (local234 == 0) {
									local271 = false;
								}
								if (local234 < 3 && local211 - 1 >= 0 && (!method344(arg0[local211 - 1]) || arg0[local211 - 1] == '\'')) {
									local271 = false;
								}
								if (local271 && !method350(local232)) {
									local207 = true;
								}
							}
							local211++;
						}
						if (!local207) {
							local105 = false;
						}
					}
				} else {
					var8 = ' ';
					if (local9 - 1 >= 0) {
						var8 = arg0[local9 - 1];
					}
					var9 = ' ';
					if (local13 < arg0.length) {
						var9 = arg0[local13];
					}
					@Pc(147) byte local147 = method340(var8);
					@Pc(150) byte local150 = method340(var9);
					if (arg2 != null && method337(arg2, local147, local150)) {
						local105 = false;
					}
				}
				if (local105) {
					if (aBoolean47) {
						System.out.println("Filtered word: " + arg1 + " at char " + local9);
					}
					for (@Pc(334) int local334 = local9; local334 < local13; local334++) {
						arg0[local334] = '*';
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([[BBB)Z")
	private static boolean method337(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) {
		@Pc(1) int local1 = 0;
		if (arg0[local1][0] == arg1 && arg0[local1][1] == arg2) {
			return true;
		}
		@Pc(22) int local22 = arg0.length - 1;
		if (arg0[local22][0] == arg1 && arg0[local22][1] == arg2) {
			return true;
		}
		do {
			@Pc(44) int local44 = (local1 + local22) / 2;
			if (arg0[local44][0] == arg1 && arg0[local44][1] == arg2) {
				return true;
			}
			if (arg1 < arg0[local44][0] || arg1 == arg0[local44][0] && arg2 < arg0[local44][1]) {
				local22 = local44;
			} else {
				local1 = local44;
			}
		} while (local1 != local22 && local1 + 1 != local22);
		return false;
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(CCC)I")
	private static int method338(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
		if (arg0 == arg1) {
			return 1;
		} else if (arg0 == 'e' && arg1 == '3') {
			return 1;
		} else if (arg0 == 't' && (arg1 == '7' || arg1 == '+')) {
			return 1;
		} else if (arg0 == 'a' && (arg1 == '4' || arg1 == '@')) {
			return 1;
		} else if (arg0 == 'o' && arg1 == '0') {
			return 1;
		} else if (arg0 == 'i' && arg1 == '1') {
			return 1;
		} else if (arg0 == 's' && arg1 == '5') {
			return 1;
		} else if (arg0 == 'f' && arg1 == 'p' && arg2 == 'h') {
			return 2;
		} else if (arg0 == 'g' && arg1 == '9') {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "(CCC)I")
	private static int method339(@OriginalArg(0) char arg0, @OriginalArg(1) char arg1, @OriginalArg(2) char arg2) {
		if (arg0 == '*') {
			return 0;
		} else if (arg0 == arg1) {
			return 1;
		} else {
			if (arg0 >= 'a' && arg0 <= 'z') {
				if (arg0 == 'e') {
					if (arg1 == '3') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 't') {
					if (arg1 == '7') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'a') {
					if (arg1 != '4' && arg1 != '@') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'o') {
					if (arg1 != '0' && arg1 != '*') {
						if (arg1 == '(' && arg2 == ')') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'n') {
					return 0;
				}
				if (arg0 == 's') {
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'r') {
					return 0;
				}
				if (arg0 == 'h') {
					return 0;
				}
				if (arg0 == 'l') {
					if (arg1 == '1') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'd') {
					return 0;
				}
				if (arg0 == 'c') {
					if (arg1 == '(') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'm') {
					return 0;
				}
				if (arg0 == 'f') {
					if (arg1 == 'p' && arg2 == 'h') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'p') {
					return 0;
				}
				if (arg0 == 'g') {
					if (arg1 != '9' && arg1 != '6') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'w') {
					if (arg1 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'y') {
					return 0;
				}
				if (arg0 == 'b') {
					if (arg1 == '1' && arg2 == '3') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'v') {
					return 0;
				}
				if (arg0 == 'k') {
					return 0;
				}
				if (arg0 == 'x') {
					if (arg1 == ')' && arg2 == '(') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'j') {
					return 0;
				}
				if (arg0 == 'q') {
					return 0;
				}
				if (arg0 == 'z') {
					return 0;
				}
			}
			if (arg0 >= '0' && arg0 <= '9') {
				if (arg0 == '0') {
					if (arg1 != 'o' && arg1 != 'O') {
						if (arg1 == '(' && arg2 == ')') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == '1') {
					if (arg1 == 'l') {
						return 1;
					}
					return 0;
				}
				if (arg0 == '2') {
					return 0;
				}
				if (arg0 == '3') {
					return 0;
				}
				if (arg0 == '4') {
					return 0;
				}
				if (arg0 == '5') {
					return 0;
				}
				if (arg0 == '6') {
					return 0;
				}
				if (arg0 == '7') {
					return 0;
				}
				if (arg0 == '8') {
					return 0;
				}
				if (arg0 == '9') {
					return 0;
				}
			}
			if (arg0 == '-') {
				return 0;
			} else if (arg0 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg0 == '(') {
				return 0;
			} else if (arg0 == ')') {
				return 0;
			} else if (arg0 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else if (arg0 == '\'') {
				return 0;
			} else {
				if (aBoolean47) {
					System.out.println("Letter=" + arg0 + " not matched");
				}
				return 0;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "(C)B")
	private static byte method340(@OriginalArg(0) char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 + 1 - 'a');
		} else if (arg0 == '\'') {
			return 28;
		} else if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 + 29 - '0');
		} else {
			return 27;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "e", descriptor = "([C)V")
	private static void method341(@OriginalArg(0) char[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (true) {
			do {
				@Pc(104) int local104;
				if ((local104 = method342(arg0, local5)) == -1) {
					return;
				}
				@Pc(13) boolean local13 = false;
				for (@Pc(15) int local15 = local5; local15 >= 0 && local15 < local104 && !local13; local15++) {
					if (!method344(arg0[local15]) && !method345(arg0[local15])) {
						local13 = true;
					}
				}
				if (local13) {
					local7 = 0;
				}
				if (local7 == 0) {
					local9 = local104;
				}
				local5 = method343(arg0, local104);
				@Pc(51) int local51 = 0;
				for (@Pc(53) int local53 = local104; local53 < local5; local53++) {
					local51 = local51 * 10 + arg0[local53] - 48;
				}
				if (local51 <= 255 && local5 - local104 <= 8) {
					local7++;
				} else {
					local7 = 0;
				}
			} while (local7 != 4);
			for (@Pc(87) int local87 = local9; local87 < local5; local87++) {
				arg0[local87] = '*';
			}
			local7 = 0;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "a", descriptor = "([CI)I")
	private static int method342(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = arg1; local1 < arg0.length && local1 >= 0; local1++) {
			if (arg0[local1] >= '0' && arg0[local1] <= '9') {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "([CI)I")
	private static int method343(@OriginalArg(0) char[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		while (true) {
			if (local1 < arg0.length && local1 >= 0) {
				if (arg0[local1] >= '0' && arg0[local1] <= '9') {
					local1++;
					continue;
				}
				return local1;
			}
			return arg0.length;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "b", descriptor = "(C)Z")
	private static boolean method344(@OriginalArg(0) char arg0) {
		return !method346(arg0) && !method347(arg0);
	}

	@OriginalMember(owner = "mudclient!a/g", name = "c", descriptor = "(C)Z")
	private static boolean method345(@OriginalArg(0) char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "mudclient!a/g", name = "d", descriptor = "(C)Z")
	private static boolean method346(@OriginalArg(0) char arg0) {
		return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "e", descriptor = "(C)Z")
	private static boolean method347(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "f", descriptor = "(C)Z")
	private static boolean method348(@OriginalArg(0) char arg0) {
		return arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "g", descriptor = "(C)Z")
	private static boolean method349(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z';
	}

	@OriginalMember(owner = "mudclient!a/g", name = "f", descriptor = "([C)Z")
	private static boolean method350(@OriginalArg(0) char[] arg0) {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (!method347(arg0[local5]) && arg0[local5] != '\u0000') {
				local3 = false;
			}
		}
		if (local3) {
			return true;
		}
		@Pc(30) int local30 = method351(arg0);
		@Pc(32) int local32 = 0;
		@Pc(37) int local37 = anIntArray96.length - 1;
		if (local30 == anIntArray96[local32] || local30 == anIntArray96[local37]) {
			return true;
		}
		do {
			@Pc(55) int local55 = (local32 + local37) / 2;
			if (local30 == anIntArray96[local55]) {
				return true;
			}
			if (local30 < anIntArray96[local55]) {
				local37 = local55;
			} else {
				local32 = local55;
			}
		} while (local32 != local37 && local32 + 1 != local37);
		return false;
	}

	@OriginalMember(owner = "mudclient!a/g", name = "g", descriptor = "([C)I")
	private static int method351(@OriginalArg(0) char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(22) char local22 = arg0[arg0.length - local11 - 1];
			if (local22 >= 'a' && local22 <= 'z') {
				local9 = local9 * 38 + local22 + 1 - 'a';
			} else if (local22 == '\'') {
				local9 = local9 * 38 + 27;
			} else if (local22 >= '0' && local22 <= '9') {
				local9 = local9 * 38 + local22 + 28 - '0';
			} else if (local22 != '\u0000') {
				if (aBoolean47) {
					System.out.println("word2hash failed on " + new String(arg0));
				}
				return 0;
			}
		}
		return local9;
	}
}
