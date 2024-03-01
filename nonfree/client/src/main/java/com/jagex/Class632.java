package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zw")
public class Class632 {

	@OriginalMember(owner = "client!zw", name = "p", descriptor = "I")
	static final int anInt5587 = 1;

	@OriginalMember(owner = "client!zw", name = "a", descriptor = "I")
	static final int anInt5588 = 12;

	@OriginalMember(owner = "client!zw", name = "h", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!zw", name = "g", descriptor = "[C")
	static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!zw", name = "l", descriptor = "[C")
	static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!zw", name = "<init>", descriptor = "()V", line = 11)
	Class632() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zw", name = "s", descriptor = "(Lclient!zm;)I", line = 16)
	static final int method33860(@OriginalArg(0) Class623 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt5573 * 1251812153) {
				case 1:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!zw", name = "x", descriptor = "(Lclient!zm;)I", line = 16)
	static final int method33861(@OriginalArg(0) Class623 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt5573 * 1251812153) {
				case 1:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!zw", name = "u", descriptor = "(Lclient!zm;)I", line = 16)
	static final int method33863(@OriginalArg(0) Class623 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt5573 * 1251812153) {
				case 1:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!zw", name = "b", descriptor = "(C)Z", line = 48)
	static final boolean method33865(@OriginalArg(0) char arg0) {
		return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!zw", name = "y", descriptor = "(C)Z", line = 48)
	static final boolean method33866(@OriginalArg(0) char arg0) {
		return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!zw", name = "z", descriptor = "(Ljava/lang/CharSequence;Lclient!zm;)Ljava/lang/String;", line = 52)
	public static String method33867(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class623 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class228.method24520(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class228.method24520(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class584.method33269(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class135.method22923(local61)) {
				@Pc(70) char local70 = Class197.method24123(local61);
				if (local70 != 0) {
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

	@OriginalMember(owner = "client!zw", name = "j", descriptor = "(Ljava/lang/CharSequence;Lclient!zm;)Ljava/lang/String;", line = 52)
	public static String method33868(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class623 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class228.method24520(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class228.method24520(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class584.method33269(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class135.method22923(local61)) {
				@Pc(70) char local70 = Class197.method24123(local61);
				if (local70 != 0) {
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

	@OriginalMember(owner = "client!zw", name = "c", descriptor = "(Ljava/lang/CharSequence;Lclient!zm;)Ljava/lang/String;", line = 52)
	public static String method33870(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class623 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class228.method24520(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class228.method24520(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class584.method33269(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class135.method22923(local61)) {
				@Pc(70) char local70 = Class197.method24123(local61);
				if (local70 != 0) {
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

	@OriginalMember(owner = "client!zw", name = "r", descriptor = "(C)C", line = 72)
	static char method33862(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "e", descriptor = "(C)C", line = 72)
	static char method33864(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "n", descriptor = "(C)C", line = 72)
	static char method33869(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "d", descriptor = "(C)C", line = 72)
	static char method33871(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "mv", descriptor = "(IZI)V", line = 11431)
	public static final void method33872(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class68.aClass3_Sub30_2 == null || (arg0 < 0 || arg0 >= Class68.aClass3_Sub30_2.anInt1331 * 132295085)) {
			return;
		}
		@Pc(16) Class238 local16 = Class68.aClass3_Sub30_2.aClass238Array1[arg0];
		@Pc(19) Class82 local19 = Class406.method27657();
		@Pc(25) Class3_Sub23 local25 = Class269.method25284(Class311.aClass311_26, local19.aClass577_2);
		local25.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(local16.aString192) + 3);
		local25.aClass3_Sub41_Sub1_1.method20251(arg0);
		local25.aClass3_Sub41_Sub1_1.method20250(arg1 ? 1 : 0);
		local25.aClass3_Sub41_Sub1_1.method20260(local16.aString192);
		local19.method21601(local25);
	}
}
