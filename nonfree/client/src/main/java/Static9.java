import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!e;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!kd;")
	public static Class3_Sub1_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "Lclient!j;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public static int anInt420 = 0;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!ae;")
	private static Class5 aClass5_161 = Static56.method972("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_162 = Static56.method972(" @whi@(X");

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!ae;")
	private static Class5 aClass5_169 = Static56.method972("This world is full)3");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_163 = aClass5_169;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_164 = Static56.method972("backhmid1");

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "[B")
	public static byte[] aByteArray3 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_165 = Static56.method972("huffman");

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!ae;")
	private static Class5 aClass5_168 = Static56.method972("Service unavailable)3");

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_166 = aClass5_168;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_167 = Static56.method972("headicons_hint");

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public static int anInt428 = 0;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method279() {
		if (Static3.anInt292 == 0) {
			return;
		}
		@Pc(15) Class3_Sub1_Sub2_Sub1 local15 = Static88.aClass3_Sub1_Sub2_Sub1_3;
		@Pc(17) int local17 = 0;
		if (Static69.anInt1818 != 0) {
			local17 = 1;
		}
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			if (Static3.aClass5Array2[local26] != null) {
				@Pc(36) int local36 = Static16.anIntArray64[local26];
				@Pc(40) Class5 local40 = Static89.aClass5Array15[local26];
				@Pc(42) byte local42 = 0;
				if (local40 != null && local40.method139(Static58.aClass5_775)) {
					local40 = local40.method159(5);
					local42 = 1;
				}
				if (local40 != null && local40.method139(Static91.aClass5_1071)) {
					local40 = local40.method159(5);
					local42 = 2;
				}
				@Pc(100) int local100;
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Static12.anInt479 == 0 || Static12.anInt479 == 1 && Static4.method134(local40))) {
					local100 = 329 - local17 * 13;
					local17++;
					local15.method277(Static101.aClass5_1156, 4, local100, 0);
					local15.method277(Static101.aClass5_1156, 4, local100 - 1, 65535);
					@Pc(123) int local123 = local15.method267(Static101.aClass5_1156) + 4;
					local123 += local15.method275(32);
					if (local42 == 1) {
						Static93.aClass3_Sub1_Sub2_Sub4Array6[0].method1857(local123, local100 - 12);
						local123 += 14;
					}
					if (local42 == 2) {
						Static93.aClass3_Sub1_Sub2_Sub4Array6[1].method1857(local123, local100 - 12);
						local123 += 14;
					}
					local15.method277(Static75.method1261(new Class5[] { local40, Static47.aClass5_623, Static3.aClass5Array2[local26] }), local123, local100, 0);
					local15.method277(Static75.method1261(new Class5[] { local40, Static47.aClass5_623, Static3.aClass5Array2[local26] }), local123, local100 - 1, 65535);
					if (local17 >= 5) {
						return;
					}
				}
				if (local36 == 5 && Static12.anInt479 < 2) {
					local100 = 329 - local17 * 13;
					local17++;
					local15.method277(Static3.aClass5Array2[local26], 4, local100, 0);
					local15.method277(Static3.aClass5Array2[local26], 4, local100 - 1, 65535);
					if (local17 >= 5) {
						return;
					}
				}
				if (local36 == 6 && Static12.anInt479 < 2) {
					local100 = 329 - local17 * 13;
					local15.method277(Static75.method1261(new Class5[] { Static116.aClass5_1365, Static67.aClass5_825, local40, Static47.aClass5_623, Static3.aClass5Array2[local26] }), 4, local100, 0);
					local17++;
					local15.method277(Static75.method1261(new Class5[] { Static116.aClass5_1365, Static67.aClass5_825, local40, Static47.aClass5_623, Static3.aClass5Array2[local26] }), 4, local100 - 1, 65535);
					if (local17 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method281() {
		Static32.aClass5_426 = Static51.aClass5_1097;
		Static1.aClass5_3 = Static76.aClass5_1164;
		Static52.aClass5_682 = Static84.aClass5_944;
		Static89.aClass5_1039 = Static104.aClass5_819;
		Static57.aClass5_769 = Static13.aClass5_190;
		Static104.aClass5_815 = Static3.aClass5_97;
		Static89.aClass5_1040 = Static27.aClass5_362;
		Static79.aClass5_904 = Static113.aClass5_1334;
		Static43.aClass5_563 = Static106.aClass5_1232;
		Static46.aClass5_607 = Static110.aClass5_1298;
		Static92.aClass5_1079 = Static70.aClass5_845;
		Static3.aClass5_100 = Static36.aClass5_1260;
		Static105.aClass5_1213 = Static108.aClass5_1278;
		Static32.aClass5_421 = Static47.aClass5_630;
		Static63.aClass5_1321 = Static88.aClass5_1022;
		Static92.aClass5_1078 = Static42.aClass5_543;
		Static74.aClass5_876 = Static82.aClass5_929;
		Static16.aClass5_268 = Static106.aClass5_1240;
		Static45.aClass5_601 = Static80.aClass5_920;
		Static15.aClass5_232 = Static64.aClass5_795;
		Static44.aClass5_579 = Static44.aClass5_586;
		Static15.aClass5_224 = Static42.aClass5_544;
		Static15.aClass5_256 = Static19.aClass5_301;
		Static15.aClass5_213 = Static60.aClass5_1360;
		Static67.aClass5_823 = Static2.aClass5_81;
		Static15.aClass5_216 = Static91.aClass5_1068;
		Static53.aClass5_700 = Static4.aClass5_104;
		Static57.aClass5_767 = Static23.aClass5_316;
		Static104.aClass5_818 = Static95.aClass5_1123;
		Static15.aClass5_245 = Static19.aClass5_301;
		Static37.aClass5_477 = Static5.aClass5_108;
		Static100.aClass5_1132 = Static91.aClass5_1075;
		Static106.aClass5_1242 = Static35.aClass5_472;
		Static4.aClass5_101 = Static70.aClass5_841;
		Static72.aClass5_859 = Static44.aClass5_585;
		Static15.aClass5_240 = Static19.aClass5_301;
		Static45.aClass5_603 = Static15.aClass5_206;
		Static15.aClass5_254 = Static95.aClass5_1118;
		Static62.aClass5_792 = Static47.aClass5_621;
		Static89.aClass5_1035 = Static104.aClass5_819;
		Static15.aClass5_248 = Static19.aClass5_301;
		Static63.aClass5_1323 = Static54.aClass5_709;
		Static23.aClass5_317 = Static62.aClass5_785;
		Static15.aClass5_244 = Static116.aClass5_1364;
		Static101.aClass5_1156 = Static106.aClass5_1235;
		Static17.aClass5_279 = Static33.aClass5_428;
		Static30.aClass5_398 = Static93.aClass5_1091;
		Static58.aClass5_773 = Static65.aClass5_1115;
		Static15.aClass5_214 = Static61.aClass5_783;
		Static14.aClass5_1294 = Static79.aClass5_901;
		Static52.aClass5_677 = Static42.aClass5_547;
		Static115.aClass5_1351 = Static60.aClass5_1361;
		Static47.aClass5_620 = Static101.aClass5_1155;
		Static2.aClass5_85 = Static65.aClass5_1110;
		Static114.aClass5_1346 = Static57.aClass5_768;
		Static27.aClass5_360 = Static81.aClass5_926;
		Static38.aClass5_482 = Static37.aClass5_475;
		Static68.aClass5_757 = Static112.aClass5_1330;
		Static103.aClass5_1201 = Static30.aClass5_399;
		Static51.aClass5_1095 = Static76.aClass5_1159;
		Static15.aClass5_235 = Static64.aClass5_795;
		Static35.aClass5_466 = Static61.aClass5_784;
		Static106.aClass5_1230 = aClass5_161;
		Static15.aClass5_246 = Static19.aClass5_301;
		Static48.aClass5_637 = Static100.aClass5_1135;
		Static94.aClass5_265 = Static42.aClass5_542;
		Static52.aClass5_683 = Static62.aClass5_789;
		Static15.aClass5_223 = Static79.aClass5_902;
		Static15.aClass5_230 = Static19.aClass5_301;
		Static31.aClass5_525 = Static116.aClass5_1363;
		Static89.aClass5_1041 = Static62.aClass5_787;
		Static88.aClass5_1023 = Static83.aClass5_942;
		Static14.aClass5_1295 = Static79.aClass5_901;
		Static15.aClass5_233 = Static42.aClass5_544;
		Static108.aClass5_1277 = Static108.aClass5_1280;
		Static15.aClass5_226 = Static19.aClass5_301;
		Static104.aClass5_821 = Static13.aClass5_189;
		Static90.aClass5_1064 = Static50.aClass5_667;
		Static43.aClass5_560 = Static113.aClass5_1339;
		Static15.aClass5_257 = Static19.aClass5_301;
		Static61.aClass5_782 = Static113.aClass5_1335;
		Static53.aClass5_697 = Static99.aClass5_1130;
		Static99.aClass5_1127 = Static111.aClass5_1314;
		Static23.aClass5_312 = Static54.aClass5_711;
		Static46.aClass5_608 = Static106.aClass5_1238;
		Static92.aClass5_1082 = Static45.aClass5_602;
		Static91.aClass5_1066 = Static35.aClass5_470;
		Static51.aClass5_1101 = Static90.aClass5_1062;
		Static5.aClass5_114 = Static63.aClass5_1324;
		Static15.aClass5_236 = Static19.aClass5_301;
		Static15.aClass5_208 = Static61.aClass5_783;
		Static43.aClass5_567 = Static50.aClass5_669;
		Static99.aClass5_1126 = Static82.aClass5_927;
		Static74.aClass5_877 = Static91.aClass5_1073;
		Static76.aClass5_1161 = Static21.aClass5_308;
		Static21.aClass5_310 = Static103.aClass5_1199;
		Static105.aClass5_1206 = Static5.aClass5_111;
		Static44.aClass5_583 = Static72.aClass5_864;
		Static110.aClass5_1308 = Static42.aClass5_541;
		Static16.aClass5_275 = Static75.aClass5_890;
		Static15.aClass5_225 = Static19.aClass5_301;
		Static2.aClass5_89 = Static104.aClass5_814;
		Static15.aClass5_237 = Static19.aClass5_301;
		Static16.aClass5_276 = Static109.aClass5_1283;
		Static106.aClass5_1239 = Static113.aClass5_1336;
		Static48.aClass5_632 = Static83.aClass5_938;
		Static106.aClass5_1237 = Static114.aClass5_1348;
		Static76.aClass5_1163 = Static54.aClass5_707;
		Static15.aClass5_227 = Static19.aClass5_301;
		Static27.aClass5_364 = Static27.aClass5_362;
		Static108.aClass5_1282 = Static43.aClass5_559;
		Static35.aClass5_473 = Static18.aClass5_283;
		Static45.aClass5_598 = Static43.aClass5_559;
		Static94.aClass5_267 = Static92.aClass5_1086;
		Static72.aClass5_861 = Static52.aClass5_679;
		Static23.aClass5_326 = Static85.aClass5_961;
		Static47.aClass5_631 = Static11.aClass5_178;
		Static32.aClass5_424 = Static56.aClass5_739;
		Static32.aClass5_422 = Static47.aClass5_630;
		Static15.aClass5_207 = Static84.aClass5_945;
		Static85.aClass5_971 = Static85.aClass5_969;
		Static40.aClass5_511 = Static70.aClass5_851;
		Static82.aClass5_928 = Static48.aClass5_633;
		Static43.aClass5_566 = Static92.aClass5_1085;
		Static33.aClass5_429 = Static88.aClass5_1021;
		Static105.aClass5_1209 = Static68.aClass5_759;
		Static80.aClass5_919 = Static60.aClass5_1359;
		Static15.aClass5_238 = Static21.aClass5_307;
		Static15.aClass5_222 = Static84.aClass5_945;
		Static15.aClass5_251 = Static19.aClass5_301;
		Static52.aClass5_681 = Static56.aClass5_736;
		Static68.aClass5_762 = Static112.aClass5_1332;
		Static54.aClass5_710 = Static78.aClass5_899;
		Static116.aClass5_1368 = Static37.aClass5_474;
		Static45.aClass5_596 = Static74.aClass5_874;
		Static34.aClass5_454 = Static10.aClass5_1274;
		Static5.aClass5_109 = Static36.aClass5_1259;
		Static53.aClass5_701 = Static61.aClass5_779;
		Static15.aClass5_212 = Static33.aClass5_431;
		Static15.aClass5_243 = Static73.aClass5_869;
		Static11.aClass5_179 = Static11.aClass5_180;
		Static58.aClass5_774 = Static65.aClass5_1115;
		Static35.aClass5_465 = Static72.aClass5_863;
		Static93.aClass5_1094 = Static92.aClass5_1077;
		Static18.aClass5_284 = Static47.aClass5_626;
		Static60.aClass5_1357 = Static116.aClass5_1369;
		Static15.aClass5_242 = Static10.aClass5_1272;
		Static73.aClass5_871 = Static91.aClass5_1074;
		Static83.aClass5_936 = Static65.aClass5_1109;
		Static64.aClass5_798 = Static85.aClass5_964;
		Static40.aClass5_510 = Static61.aClass5_778;
		Static15.aClass5_252 = Static19.aClass5_301;
		Static15.aClass5_241 = Static92.aClass5_1089;
		Static74.aClass5_873 = Static80.aClass5_921;
		Static76.aClass5_1160 = Static112.aClass5_1329;
		Static102.aClass5_1181 = Static113.aClass5_1338;
		Static12.aClass5_186 = Static12.aClass5_182;
		Static79.aClass5_905 = Static50.aClass5_666;
		Static114.aClass5_1350 = Static49.aClass5_639;
		Static15.aClass5_253 = Static19.aClass5_301;
		Static90.aClass5_1065 = Static80.aClass5_922;
		Static76.aClass5_1166 = Static90.aClass5_1060;
		Static5.aClass5_105 = Static81.aClass5_924;
		Static21.aClass5_306 = Static111.aClass5_1312;
		Static23.aClass5_324 = Static109.aClass5_1285;
		Static100.aClass5_1131 = Static1.aClass5_2;
		Static15.aClass5_228 = Static19.aClass5_301;
		Static100.aClass5_1138 = Static68.aClass5_755;
		Static101.aClass5_1152 = Static46.aClass5_612;
		Static56.aClass5_735 = Static92.aClass5_1080;
		Static61.aClass5_780 = Static83.aClass5_937;
		Static116.aClass5_1365 = Static7.aClass5_118;
		Static111.aClass5_1313 = Static7.aClass5_119;
		Static14.aClass5_1296 = Static3.aClass5_99;
		Static76.aClass5_1162 = Static68.aClass5_761;
		Static15.aClass5_234 = Static40.aClass5_512;
		Static15.aClass5_219 = Static72.aClass5_862;
		Static23.aClass5_327 = Static105.aClass5_1208;
		Static40.aClass5_515 = Static92.aClass5_1089;
		Static91.aClass5_1070 = Static82.aClass5_930;
		Static19.aClass5_302 = Static38.aClass5_481;
		Static65.aClass5_1113 = Static47.aClass5_624;
		Static15.aClass5_211 = Static84.aClass5_945;
		Static106.aClass5_1246 = Static23.aClass5_325;
		Static14.aClass5_1288 = Static54.aClass5_706;
		Static95.aClass5_1119 = Static19.aClass5_304;
		Static54.aClass5_705 = Static65.aClass5_1112;
		Static73.aClass5_867 = Static67.aClass5_822;
		Static15.aClass5_255 = Static23.aClass5_322;
		Static15.aClass5_231 = Static19.aClass5_301;
		Static82.aClass5_933 = Static12.aClass5_184;
		Static109.aClass5_1287 = Static33.aClass5_432;
		Static44.aClass5_584 = Static2.aClass5_87;
		Static10.aClass5_1275 = Static103.aClass5_1200;
		Static15.aClass5_249 = Static84.aClass5_945;
		Static110.aClass5_1305 = Static57.aClass5_771;
		Static24.aClass5_328 = Static61.aClass5_776;
		Static11.aClass5_181 = Static14.aClass5_1291;
		Static18.aClass5_286 = Static101.aClass5_1157;
		Static75.aClass5_891 = Static85.aClass5_966;
		Static91.aClass5_1076 = Static2.aClass5_86;
		Static15.aClass5_250 = Static102.aClass5_1189;
		Static15.aClass5_209 = Static85.aClass5_970;
		Static89.aClass5_1038 = Static89.aClass5_1037;
		Static109.aClass5_1286 = Static19.aClass5_301;
		Static16.aClass5_271 = Static106.aClass5_1243;
		aClass5_163 = Static42.aClass5_545;
		Static27.aClass5_365 = Static88.aClass5_1016;
		Static5.aClass5_116 = Static93.aClass5_1092;
		Static105.aClass5_1207 = Static33.aClass5_435;
		Static18.aClass5_282 = Static23.aClass5_320;
		Static34.aClass5_451 = Static115.aClass5_1356;
		Static34.aClass5_456 = Static11.aClass5_177;
		Static35.aClass5_467 = Static111.aClass5_1311;
		Static83.aClass5_943 = Static67.aClass5_824;
		Static103.aClass5_1204 = Static93.aClass5_1093;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method285() {
		aByteArrayArray2 = null;
		aClass5_166 = null;
		aClass34_1 = null;
		aClass5_161 = null;
		aClass3_Sub1_Sub1_Sub1_Sub2_1 = null;
		aClass21_2 = null;
		aClass5_163 = null;
		aClass5_164 = null;
		aClass5_167 = null;
		aByteArray3 = null;
		aClass5_168 = null;
		aClass5_165 = null;
		anIntArray51 = null;
		aClass23_1 = null;
		aClass5_162 = null;
		aClass5_169 = null;
	}
}
