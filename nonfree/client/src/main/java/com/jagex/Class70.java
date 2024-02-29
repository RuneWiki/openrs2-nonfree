package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acx")
public class Class70 {

	@OriginalMember(owner = "client!acx", name = "c", descriptor = "I")
	static final int anInt201 = 12;

	@OriginalMember(owner = "client!acx", name = "p", descriptor = "I")
	static final int anInt202 = 1;

	@OriginalMember(owner = "client!acx", name = "ug", descriptor = "I")
	public static int anInt203;

	@OriginalMember(owner = "client!acx", name = "v", descriptor = "[C")
	static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!acx", name = "l", descriptor = "[C")
	static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!acx", name = "<init>", descriptor = "()V", line = 11)
	Class70() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acx", name = "w", descriptor = "(Lclient!acd;)I", line = 16)
	static final int method985(@OriginalArg(0) Class53 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt182 * -912665199) {
				case 7:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!acx", name = "t", descriptor = "(C)Z", line = 28)
	static final boolean method986(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class601.method32040(arg0)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!acx", name = "q", descriptor = "(C)Z", line = 28)
	static final boolean method987(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class601.method32040(arg0)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!acx", name = "x", descriptor = "(C)Z", line = 28)
	static final boolean method988(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class601.method32040(arg0)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray1;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (arg0 == local22) {
					return true;
				}
			}
			local12 = aCharArray2;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!acx", name = "r", descriptor = "(C)Z", line = 48)
	static final boolean method989(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!acx", name = "d", descriptor = "(C)Z", line = 48)
	static final boolean method990(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!acx", name = "s", descriptor = "(C)Z", line = 48)
	static final boolean method991(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!acx", name = "g", descriptor = "(Ljava/lang/CharSequence;Lclient!acd;)Ljava/lang/String;", line = 52)
	public static String method992(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class351.method27893(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class351.method27893(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class471.method29621(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class316.method27378(local61)) {
				@Pc(70) char local70 = Class578.method31632(local61);
				if (local70 != '\u0000') {
					local52.append(local70);
				}
			}
		}
		if (local52.length() == 0) {
			return null;
		} else {
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!acx", name = "z", descriptor = "(Ljava/lang/CharSequence;Lclient!acd;)Ljava/lang/String;", line = 52)
	public static String method993(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class351.method27893(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class351.method27893(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class471.method29621(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class316.method27378(local61)) {
				@Pc(70) char local70 = Class578.method31632(local61);
				if (local70 != '\u0000') {
					local52.append(local70);
				}
			}
		}
		if (local52.length() == 0) {
			return null;
		} else {
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!acx", name = "j", descriptor = "(C)C", line = 72)
	static char method994(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!acx", name = "i", descriptor = "(C)C", line = 72)
	static char method995(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!acx", name = "k", descriptor = "(C)C", line = 72)
	static char method996(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!acx", name = "u", descriptor = "(C)C", line = 72)
	static char method997(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!acx", name = "e", descriptor = "(C)C", line = 72)
	static char method998(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!acx", name = "vl", descriptor = "(Lclient!yf;S)V", line = 8388)
	static final void method999(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local12 >> 28;
	}
}
