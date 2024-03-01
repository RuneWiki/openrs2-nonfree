package com.jagex;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public class Class314 {

	@OriginalMember(owner = "client!mb", name = "bl", descriptor = "Ljava/lang/String;")
	static String aString203;

	@OriginalMember(owner = "client!mb", name = "dx", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	final int anInt4535;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	final int anInt4534;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	final int anInt4536;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[B")
	final byte[] aByteArray78;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIII[B)V", line = 130)
	Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		this.anInt4535 = arg0 * -2143053351;
		this.anInt4534 = arg1 * -1211015593;
		this.anInt4536 = arg2 * 57105061;
		this.aByteArray78 = arg4;
	}

	@OriginalMember(owner = "client!mb", name = "dv", descriptor = "(I)V", line = 273)
	static void method25828() {
		@Pc(1) int local1 = -1;
		if (Class58_Sub1.aClass3_Sub1_Sub4_2 != null) {
			local1 = Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2649 * 75245013;
		}
		Class473.method28782();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				Class58_Sub1.aClass14ArrayArray1[local13][local18] = null;
				Class58_Sub1.aClass611ArrayArray1[local13][local18] = null;
			}
		}
		Class58_Sub1.aClass3_Sub1_Sub4_2 = null;
		if (local1 != -1) {
			Class10.method720(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "(I)[Lclient!pc;", line = 1159)
	public static Class385[] method25829() {
		return new Class385[] { Class385.aClass385_922, Class385.aClass385_675, Class385.aClass385_661, Class385.aClass385_464, Class385.aClass385_970, Class385.aClass385_49, Class385.aClass385_962, Class385.aClass385_870, Class385.aClass385_966, Class385.aClass385_405, Class385.aClass385_215, Class385.aClass385_873, Class385.aClass385_105, Class385.aClass385_256, Class385.aClass385_461, Class385.aClass385_1090, Class385.aClass385_387, Class385.aClass385_23, Class385.aClass385_35, Class385.aClass385_336, Class385.aClass385_978, Class385.aClass385_987, Class385.aClass385_650, Class385.aClass385_608, Class385.aClass385_388, Class385.aClass385_148, Class385.aClass385_345, Class385.aClass385_742, Class385.aClass385_232, Class385.aClass385_779, Class385.aClass385_229, Class385.aClass385_1074, Class385.aClass385_777, Class385.aClass385_352, Class385.aClass385_755, Class385.aClass385_280, Class385.aClass385_564, Class385.aClass385_309, Class385.aClass385_746, Class385.aClass385_103, Class385.aClass385_239, Class385.aClass385_1136, Class385.aClass385_811, Class385.aClass385_648, Class385.aClass385_1067, Class385.aClass385_378, Class385.aClass385_11, Class385.aClass385_783, Class385.aClass385_613, Class385.aClass385_963, Class385.aClass385_662, Class385.aClass385_87, Class385.aClass385_77, Class385.aClass385_355, Class385.aClass385_442, Class385.aClass385_440, Class385.aClass385_555, Class385.aClass385_1132, Class385.aClass385_726, Class385.aClass385_1108, Class385.aClass385_6, Class385.aClass385_186, Class385.aClass385_668, Class385.aClass385_418, Class385.aClass385_794, Class385.aClass385_878, Class385.aClass385_823, Class385.aClass385_1018, Class385.aClass385_439, Class385.aClass385_1114, Class385.aClass385_142, Class385.aClass385_1015, Class385.aClass385_494, Class385.aClass385_401, Class385.aClass385_901, Class385.aClass385_72, Class385.aClass385_244, Class385.aClass385_950, Class385.aClass385_1117, Class385.aClass385_263, Class385.aClass385_968, Class385.aClass385_1008, Class385.aClass385_827, Class385.aClass385_955, Class385.aClass385_298, Class385.aClass385_408, Class385.aClass385_20, Class385.aClass385_871, Class385.aClass385_270, Class385.aClass385_653, Class385.aClass385_310, Class385.aClass385_921, Class385.aClass385_774, Class385.aClass385_257, Class385.aClass385_685, Class385.aClass385_448, Class385.aClass385_743, Class385.aClass385_967, Class385.aClass385_762, Class385.aClass385_86, Class385.aClass385_159, Class385.aClass385_10, Class385.aClass385_939, Class385.aClass385_242, Class385.aClass385_857, Class385.aClass385_837, Class385.aClass385_731, Class385.aClass385_327, Class385.aClass385_66, Class385.aClass385_538, Class385.aClass385_4, Class385.aClass385_594, Class385.aClass385_374, Class385.aClass385_433, Class385.aClass385_38, Class385.aClass385_410, Class385.aClass385_541, Class385.aClass385_282, Class385.aClass385_225, Class385.aClass385_988, Class385.aClass385_924, Class385.aClass385_496, Class385.aClass385_1141, Class385.aClass385_1034, Class385.aClass385_110, Class385.aClass385_886, Class385.aClass385_484, Class385.aClass385_843, Class385.aClass385_214, Class385.aClass385_1004, Class385.aClass385_1066, Class385.aClass385_1095, Class385.aClass385_820, Class385.aClass385_293, Class385.aClass385_233, Class385.aClass385_1037, Class385.aClass385_362, Class385.aClass385_696, Class385.aClass385_73, Class385.aClass385_834, Class385.aClass385_288, Class385.aClass385_533, Class385.aClass385_806, Class385.aClass385_204, Class385.aClass385_845, Class385.aClass385_910, Class385.aClass385_146, Class385.aClass385_813, Class385.aClass385_958, Class385.aClass385_267, Class385.aClass385_625, Class385.aClass385_840, Class385.aClass385_832, Class385.aClass385_266, Class385.aClass385_375, Class385.aClass385_684, Class385.aClass385_98, Class385.aClass385_984, Class385.aClass385_196, Class385.aClass385_890, Class385.aClass385_8, Class385.aClass385_580, Class385.aClass385_1036, Class385.aClass385_477, Class385.aClass385_391, Class385.aClass385_400, Class385.aClass385_713, Class385.aClass385_259, Class385.aClass385_432, Class385.aClass385_52, Class385.aClass385_540, Class385.aClass385_1097, Class385.aClass385_228, Class385.aClass385_452, Class385.aClass385_530, Class385.aClass385_416, Class385.aClass385_1107, Class385.aClass385_59, Class385.aClass385_189, Class385.aClass385_981, Class385.aClass385_1048, Class385.aClass385_536, Class385.aClass385_417, Class385.aClass385_545, Class385.aClass385_851, Class385.aClass385_1041, Class385.aClass385_92, Class385.aClass385_291, Class385.aClass385_1115, Class385.aClass385_553, Class385.aClass385_1010, Class385.aClass385_801, Class385.aClass385_778, Class385.aClass385_928, Class385.aClass385_486, Class385.aClass385_949, Class385.aClass385_593, Class385.aClass385_1078, Class385.aClass385_682, Class385.aClass385_752, Class385.aClass385_495, Class385.aClass385_469, Class385.aClass385_306, Class385.aClass385_930, Class385.aClass385_947, Class385.aClass385_1063, Class385.aClass385_62, Class385.aClass385_184, Class385.aClass385_641, Class385.aClass385_828, Class385.aClass385_303, Class385.aClass385_272, Class385.aClass385_116, Class385.aClass385_677, Class385.aClass385_983, Class385.aClass385_1088, Class385.aClass385_48, Class385.aClass385_740, Class385.aClass385_151, Class385.aClass385_1079, Class385.aClass385_619, Class385.aClass385_5, Class385.aClass385_473, Class385.aClass385_122, Class385.aClass385_1061, Class385.aClass385_321, Class385.aClass385_1104, Class385.aClass385_1051, Class385.aClass385_866, Class385.aClass385_725, Class385.aClass385_1016, Class385.aClass385_488, Class385.aClass385_1087, Class385.aClass385_506, Class385.aClass385_979, Class385.aClass385_598, Class385.aClass385_563, Class385.aClass385_1089, Class385.aClass385_201, Class385.aClass385_169, Class385.aClass385_624, Class385.aClass385_539, Class385.aClass385_913, Class385.aClass385_635, Class385.aClass385_7, Class385.aClass385_531, Class385.aClass385_532, Class385.aClass385_109, Class385.aClass385_1060, Class385.aClass385_318, Class385.aClass385_1075, Class385.aClass385_195, Class385.aClass385_21, Class385.aClass385_814, Class385.aClass385_660, Class385.aClass385_329, Class385.aClass385_271, Class385.aClass385_1083, Class385.aClass385_476, Class385.aClass385_1042, Class385.aClass385_629, Class385.aClass385_365, Class385.aClass385_1038, Class385.aClass385_1130, Class385.aClass385_771, Class385.aClass385_507, Class385.aClass385_957, Class385.aClass385_986, Class385.aClass385_351, Class385.aClass385_449, Class385.aClass385_757, Class385.aClass385_1002, Class385.aClass385_911, Class385.aClass385_1143, Class385.aClass385_350, Class385.aClass385_481, Class385.aClass385_170, Class385.aClass385_781, Class385.aClass385_964, Class385.aClass385_956, Class385.aClass385_678, Class385.aClass385_27, Class385.aClass385_835, Class385.aClass385_402, Class385.aClass385_974, Class385.aClass385_666, Class385.aClass385_721, Class385.aClass385_78, Class385.aClass385_1120, Class385.aClass385_880, Class385.aClass385_1033, Class385.aClass385_373, Class385.aClass385_29, Class385.aClass385_711, Class385.aClass385_287, Class385.aClass385_172, Class385.aClass385_31, Class385.aClass385_560, Class385.aClass385_307, Class385.aClass385_775, Class385.aClass385_158, Class385.aClass385_489, Class385.aClass385_1050, Class385.aClass385_99, Class385.aClass385_383, Class385.aClass385_236, Class385.aClass385_526, Class385.aClass385_824, Class385.aClass385_844, Class385.aClass385_284, Class385.aClass385_706, Class385.aClass385_246, Class385.aClass385_25, Class385.aClass385_1086, Class385.aClass385_569, Class385.aClass385_325, Class385.aClass385_1110, Class385.aClass385_1017, Class385.aClass385_258, Class385.aClass385_615, Class385.aClass385_1137, Class385.aClass385_297, Class385.aClass385_927, Class385.aClass385_275, Class385.aClass385_881, Class385.aClass385_180, Class385.aClass385_398, Class385.aClass385_751, Class385.aClass385_1139, Class385.aClass385_281, Class385.aClass385_1131, Class385.aClass385_508, Class385.aClass385_119, Class385.aClass385_71, Class385.aClass385_715, Class385.aClass385_63, Class385.aClass385_816, Class385.aClass385_529, Class385.aClass385_601, Class385.aClass385_708, Class385.aClass385_600, Class385.aClass385_836, Class385.aClass385_207, Class385.aClass385_139, Class385.aClass385_565, Class385.aClass385_248, Class385.aClass385_744, Class385.aClass385_819, Class385.aClass385_1142, Class385.aClass385_252, Class385.aClass385_1126, Class385.aClass385_1118, Class385.aClass385_760, Class385.aClass385_544, Class385.aClass385_1122, Class385.aClass385_26, Class385.aClass385_179, Class385.aClass385_1096, Class385.aClass385_547, Class385.aClass385_44, Class385.aClass385_68, Class385.aClass385_960, Class385.aClass385_805, Class385.aClass385_896, Class385.aClass385_750, Class385.aClass385_200, Class385.aClass385_651, Class385.aClass385_36, Class385.aClass385_687, Class385.aClass385_951, Class385.aClass385_1105, Class385.aClass385_985, Class385.aClass385_456, Class385.aClass385_154, Class385.aClass385_397, Class385.aClass385_502, Class385.aClass385_872, Class385.aClass385_925, Class385.aClass385_898, Class385.aClass385_859, Class385.aClass385_945, Class385.aClass385_443, Class385.aClass385_315, Class385.aClass385_676, Class385.aClass385_504, Class385.aClass385_1035, Class385.aClass385_797, Class385.aClass385_518, Class385.aClass385_891, Class385.aClass385_95, Class385.aClass385_221, Class385.aClass385_644, Class385.aClass385_821, Class385.aClass385_612, Class385.aClass385_451, Class385.aClass385_729, Class385.aClass385_424, Class385.aClass385_883, Class385.aClass385_933, Class385.aClass385_767, Class385.aClass385_610, Class385.aClass385_602, Class385.aClass385_782, Class385.aClass385_763, Class385.aClass385_710, Class385.aClass385_1028, Class385.aClass385_444, Class385.aClass385_861, Class385.aClass385_1084, Class385.aClass385_534, Class385.aClass385_732, Class385.aClass385_846, Class385.aClass385_765, Class385.aClass385_396, Class385.aClass385_136, Class385.aClass385_377, Class385.aClass385_112, Class385.aClass385_344, Class385.aClass385_409, Class385.aClass385_46, Class385.aClass385_722, Class385.aClass385_1116, Class385.aClass385_572, Class385.aClass385_1102, Class385.aClass385_747, Class385.aClass385_28, Class385.aClass385_419, Class385.aClass385_240, Class385.aClass385_874, Class385.aClass385_278, Class385.aClass385_980, Class385.aClass385_261, Class385.aClass385_948, Class385.aClass385_247, Class385.aClass385_795, Class385.aClass385_1140, Class385.aClass385_251, Class385.aClass385_997, Class385.aClass385_633, Class385.aClass385_907, Class385.aClass385_253, Class385.aClass385_404, Class385.aClass385_899, Class385.aClass385_211, Class385.aClass385_918, Class385.aClass385_971, Class385.aClass385_822, Class385.aClass385_1047, Class385.aClass385_43, Class385.aClass385_863, Class385.aClass385_894, Class385.aClass385_128, Class385.aClass385_82, Class385.aClass385_586, Class385.aClass385_1071, Class385.aClass385_926, Class385.aClass385_74, Class385.aClass385_75, Class385.aClass385_558, Class385.aClass385_493, Class385.aClass385_1044, Class385.aClass385_446, Class385.aClass385_643, Class385.aClass385_30, Class385.aClass385_317, Class385.aClass385_510, Class385.aClass385_380, Class385.aClass385_475, Class385.aClass385_631, Class385.aClass385_219, Class385.aClass385_825, Class385.aClass385_337, Class385.aClass385_535, Class385.aClass385_734, Class385.aClass385_161, Class385.aClass385_576, Class385.aClass385_976, Class385.aClass385_1109, Class385.aClass385_3, Class385.aClass385_166, Class385.aClass385_1070, Class385.aClass385_623, Class385.aClass385_300, Class385.aClass385_867, Class385.aClass385_220, Class385.aClass385_756, Class385.aClass385_524, Class385.aClass385_1125, Class385.aClass385_854, Class385.aClass385_213, Class385.aClass385_366, Class385.aClass385_107, Class385.aClass385_753, Class385.aClass385_770, Class385.aClass385_727, Class385.aClass385_1064, Class385.aClass385_175, Class385.aClass385_885, Class385.aClass385_1100, Class385.aClass385_663, Class385.aClass385_155, Class385.aClass385_818, Class385.aClass385_1006, Class385.aClass385_902, Class385.aClass385_585, Class385.aClass385_376, Class385.aClass385_654, Class385.aClass385_792, Class385.aClass385_178, Class385.aClass385_206, Class385.aClass385_1049, Class385.aClass385_436, Class385.aClass385_425, Class385.aClass385_817, Class385.aClass385_996, Class385.aClass385_869, Class385.aClass385_358, Class385.aClass385_888, Class385.aClass385_577, Class385.aClass385_673, Class385.aClass385_882, Class385.aClass385_556, Class385.aClass385_56, Class385.aClass385_788, Class385.aClass385_1124, Class385.aClass385_923, Class385.aClass385_969, Class385.aClass385_1012, Class385.aClass385_218, Class385.aClass385_856, Class385.aClass385_137, Class385.aClass385_141, Class385.aClass385_809, Class385.aClass385_415, Class385.aClass385_478, Class385.aClass385_938, Class385.aClass385_649, Class385.aClass385_1024, Class385.aClass385_39, Class385.aClass385_1019, Class385.aClass385_250, Class385.aClass385_326, Class385.aClass385_227, Class385.aClass385_681, Class385.aClass385_875, Class385.aClass385_700, Class385.aClass385_943, Class385.aClass385_697, Class385.aClass385_640, Class385.aClass385_470, Class385.aClass385_330, Class385.aClass385_64, Class385.aClass385_254, Class385.aClass385_584, Class385.aClass385_841, Class385.aClass385_929, Class385.aClass385_864, Class385.aClass385_465, Class385.aClass385_606, Class385.aClass385_245, Class385.aClass385_135, Class385.aClass385_328, Class385.aClass385_381, Class385.aClass385_118, Class385.aClass385_723, Class385.aClass385_224, Class385.aClass385_862, Class385.aClass385_130, Class385.aClass385_1092, Class385.aClass385_748, Class385.aClass385_709, Class385.aClass385_96, Class385.aClass385_628, Class385.aClass385_203, Class385.aClass385_965, Class385.aClass385_735, Class385.aClass385_800, Class385.aClass385_659, Class385.aClass385_935, Class385.aClass385_670, Class385.aClass385_277, Class385.aClass385_354, Class385.aClass385_511, Class385.aClass385_163, Class385.aClass385_353, Class385.aClass385_406, Class385.aClass385_364, Class385.aClass385_222, Class385.aClass385_286, Class385.aClass385_265, Class385.aClass385_1032, Class385.aClass385_761, Class385.aClass385_1144, Class385.aClass385_512, Class385.aClass385_372, Class385.aClass385_528, Class385.aClass385_936, Class385.aClass385_807, Class385.aClass385_537, Class385.aClass385_313, Class385.aClass385_1000, Class385.aClass385_312, Class385.aClass385_639, Class385.aClass385_150, Class385.aClass385_900, Class385.aClass385_1013, Class385.aClass385_460, Class385.aClass385_994, Class385.aClass385_1121, Class385.aClass385_618, Class385.aClass385_694, Class385.aClass385_808, Class385.aClass385_1029, Class385.aClass385_485, Class385.aClass385_289, Class385.aClass385_552, Class385.aClass385_1020, Class385.aClass385_1046, Class385.aClass385_454, Class385.aClass385_799, Class385.aClass385_858, Class385.aClass385_173, Class385.aClass385_462, Class385.aClass385_152, Class385.aClass385_789, Class385.aClass385_525, Class385.aClass385_849, Class385.aClass385_1098, Class385.aClass385_1113, Class385.aClass385_557, Class385.aClass385_14, Class385.aClass385_716, Class385.aClass385_1072, Class385.aClass385_517, Class385.aClass385_714, Class385.aClass385_1003, Class385.aClass385_370, Class385.aClass385_61, Class385.aClass385_626, Class385.aClass385_826, Class385.aClass385_70, Class385.aClass385_853, Class385.aClass385_131, Class385.aClass385_199, Class385.aClass385_434, Class385.aClass385_847, Class385.aClass385_621, Class385.aClass385_234, Class385.aClass385_331, Class385.aClass385_126, Class385.aClass385_543, Class385.aClass385_852, Class385.aClass385_571, Class385.aClass385_914, Class385.aClass385_1, Class385.aClass385_65, Class385.aClass385_457, Class385.aClass385_838, Class385.aClass385_34, Class385.aClass385_322, Class385.aClass385_407, Class385.aClass385_188, Class385.aClass385_255, Class385.aClass385_605, Class385.aClass385_501, Class385.aClass385_160, Class385.aClass385_174, Class385.aClass385_125, Class385.aClass385_906, Class385.aClass385_575, Class385.aClass385_749, Class385.aClass385_904, Class385.aClass385_101, Class385.aClass385_736, Class385.aClass385_342, Class385.aClass385_785, Class385.aClass385_276, Class385.aClass385_9, Class385.aClass385_895, Class385.aClass385_411, Class385.aClass385_578, Class385.aClass385_1001, Class385.aClass385_810, Class385.aClass385_348, Class385.aClass385_18, Class385.aClass385_637, Class385.aClass385_611, Class385.aClass385_390, Class385.aClass385_1128, Class385.aClass385_33, Class385.aClass385_450, Class385.aClass385_162, Class385.aClass385_1023, Class385.aClass385_784, Class385.aClass385_1030, Class385.aClass385_617, Class385.aClass385_334, Class385.aClass385_786, Class385.aClass385_426, Class385.aClass385_596, Class385.aClass385_79, Class385.aClass385_695, Class385.aClass385_733, Class385.aClass385_1021, Class385.aClass385_664, Class385.aClass385_192, Class385.aClass385_509, Class385.aClass385_84, Class385.aClass385_357, Class385.aClass385_395, Class385.aClass385_953, Class385.aClass385_791, Class385.aClass385_262, Class385.aClass385_667, Class385.aClass385_646, Class385.aClass385_205, Class385.aClass385_140, Class385.aClass385_790, Class385.aClass385_833, Class385.aClass385_642, Class385.aClass385_879, Class385.aClass385_952, Class385.aClass385_603, Class385.aClass385_249, Class385.aClass385_145, Class385.aClass385_812, Class385.aClass385_389, Class385.aClass385_399, Class385.aClass385_738, Class385.aClass385_768, Class385.aClass385_1138, Class385.aClass385_314, Class385.aClass385_15, Class385.aClass385_1119, Class385.aClass385_912, Class385.aClass385_803, Class385.aClass385_264, Class385.aClass385_932, Class385.aClass385_1101, Class385.aClass385_942, Class385.aClass385_892, Class385.aClass385_394, Class385.aClass385_500, Class385.aClass385_718, Class385.aClass385_589, Class385.aClass385_2, Class385.aClass385_1065, Class385.aClass385_597, Class385.aClass385_574, Class385.aClass385_549, Class385.aClass385_468, Class385.aClass385_1073, Class385.aClass385_946, Class385.aClass385_316, Class385.aClass385_341, Class385.aClass385_164, Class385.aClass385_384, Class385.aClass385_45, Class385.aClass385_793, Class385.aClass385_829, Class385.aClass385_842, Class385.aClass385_333, Class385.aClass385_972, Class385.aClass385_379, Class385.aClass385_274, Class385.aClass385_422, Class385.aClass385_590, Class385.aClass385_194, Class385.aClass385_831, Class385.aClass385_1077, Class385.aClass385_523, Class385.aClass385_299, Class385.aClass385_386, Class385.aClass385_385, Class385.aClass385_129, Class385.aClass385_190, Class385.aClass385_692, Class385.aClass385_490, Class385.aClass385_636, Class385.aClass385_53, Class385.aClass385_514, Class385.aClass385_876, Class385.aClass385_480, Class385.aClass385_1022, Class385.aClass385_1007, Class385.aClass385_977, Class385.aClass385_652, Class385.aClass385_187, Class385.aClass385_672, Class385.aClass385_1076, Class385.aClass385_320, Class385.aClass385_181, Class385.aClass385_1103, Class385.aClass385_712, Class385.aClass385_622, Class385.aClass385_19, Class385.aClass385_503, Class385.aClass385_999, Class385.aClass385_138, Class385.aClass385_616, Class385.aClass385_455, Class385.aClass385_1040, Class385.aClass385_830, Class385.aClass385_961, Class385.aClass385_243, Class385.aClass385_58, Class385.aClass385_324, Class385.aClass385_40, Class385.aClass385_83, Class385.aClass385_689, Class385.aClass385_772, Class385.aClass385_371, Class385.aClass385_102, Class385.aClass385_123, Class385.aClass385_479, Class385.aClass385_412, Class385.aClass385_302, Class385.aClass385_335, Class385.aClass385_32, Class385.aClass385_739, Class385.aClass385_447, Class385.aClass385_728, Class385.aClass385_143, Class385.aClass385_437, Class385.aClass385_893, Class385.aClass385_1082, Class385.aClass385_134, Class385.aClass385_421, Class385.aClass385_548, Class385.aClass385_897, Class385.aClass385_413, Class385.aClass385_285, Class385.aClass385_279, Class385.aClass385_349, Class385.aClass385_515, Class385.aClass385_645, Class385.aClass385_665, Class385.aClass385_745, Class385.aClass385_915, Class385.aClass385_679, Class385.aClass385_197, Class385.aClass385_1053, Class385.aClass385_522, Class385.aClass385_17, Class385.aClass385_604, Class385.aClass385_305, Class385.aClass385_37, Class385.aClass385_113, Class385.aClass385_55, Class385.aClass385_1026, Class385.aClass385_241, Class385.aClass385_212, Class385.aClass385_701, Class385.aClass385_776, Class385.aClass385_691, Class385.aClass385_41, Class385.aClass385_80, Class385.aClass385_1091, Class385.aClass385_319, Class385.aClass385_919, Class385.aClass385_50, Class385.aClass385_780, Class385.aClass385_472, Class385.aClass385_992, Class385.aClass385_680, Class385.aClass385_647, Class385.aClass385_392, Class385.aClass385_1145, Class385.aClass385_132, Class385.aClass385_630, Class385.aClass385_1011, Class385.aClass385_759, Class385.aClass385_295, Class385.aClass385_860, Class385.aClass385_702, Class385.aClass385_182, Class385.aClass385_579, Class385.aClass385_238, Class385.aClass385_698, Class385.aClass385_909, Class385.aClass385_989, Class385.aClass385_719, Class385.aClass385_1123, Class385.aClass385_527, Class385.aClass385_420, Class385.aClass385_688, Class385.aClass385_474, Class385.aClass385_445, Class385.aClass385_497, Class385.aClass385_106, Class385.aClass385_941, Class385.aClass385_599, Class385.aClass385_559, Class385.aClass385_766, Class385.aClass385_367, Class385.aClass385_147, Class385.aClass385_60, Class385.aClass385_607, Class385.aClass385_848, Class385.aClass385_796, Class385.aClass385_453, Class385.aClass385_414, Class385.aClass385_167, Class385.aClass385_737, Class385.aClass385_1129, Class385.aClass385_168, Class385.aClass385_588, Class385.aClass385_76, Class385.aClass385_185, Class385.aClass385_191, Class385.aClass385_111, Class385.aClass385_720, Class385.aClass385_741, Class385.aClass385_551, Class385.aClass385_1085, Class385.aClass385_1005, Class385.aClass385_120, Class385.aClass385_482, Class385.aClass385_595, Class385.aClass385_296, Class385.aClass385_1057, Class385.aClass385_491, Class385.aClass385_567, Class385.aClass385_463, Class385.aClass385_1045, Class385.aClass385_973, Class385.aClass385_730, Class385.aClass385_954, Class385.aClass385_1055, Class385.aClass385_193, Class385.aClass385_868, Class385.aClass385_917, Class385.aClass385_798, Class385.aClass385_669, Class385.aClass385_884, Class385.aClass385_492, Class385.aClass385_658, Class385.aClass385_520, Class385.aClass385_85, Class385.aClass385_273, Class385.aClass385_1099, Class385.aClass385_237, Class385.aClass385_343, Class385.aClass385_554, Class385.aClass385_403, Class385.aClass385_216, Class385.aClass385_165, Class385.aClass385_338, Class385.aClass385_703, Class385.aClass385_323, Class385.aClass385_459, Class385.aClass385_210, Class385.aClass385_815, Class385.aClass385_717, Class385.aClass385_1052, Class385.aClass385_67, Class385.aClass385_226, Class385.aClass385_311, Class385.aClass385_583, Class385.aClass385_499, Class385.aClass385_566, Class385.aClass385_704, Class385.aClass385_764, Class385.aClass385_69, Class385.aClass385_614, Class385.aClass385_1093, Class385.aClass385_427, Class385.aClass385_290, Class385.aClass385_587, Class385.aClass385_57, Class385.aClass385_931, Class385.aClass385_369, Class385.aClass385_627, Class385.aClass385_769, Class385.aClass385_356, Class385.aClass385_47, Class385.aClass385_804, Class385.aClass385_705, Class385.aClass385_332, Class385.aClass385_655, Class385.aClass385_609, Class385.aClass385_693, Class385.aClass385_217, Class385.aClass385_802, Class385.aClass385_301, Class385.aClass385_638, Class385.aClass385_1080, Class385.aClass385_235, Class385.aClass385_887, Class385.aClass385_483, Class385.aClass385_97, Class385.aClass385_466, Class385.aClass385_1133, Class385.aClass385_568, Class385.aClass385_42, Class385.aClass385_505, Class385.aClass385_1112, Class385.aClass385_865, Class385.aClass385_283, Class385.aClass385_998, Class385.aClass385_117, Class385.aClass385_209, Class385.aClass385_93, Class385.aClass385_81, Class385.aClass385_993, Class385.aClass385_104, Class385.aClass385_359, Class385.aClass385_674, Class385.aClass385_308, Class385.aClass385_905, Class385.aClass385_13, Class385.aClass385_115, Class385.aClass385_656, Class385.aClass385_1056, Class385.aClass385_24, Class385.aClass385_1043, Class385.aClass385_467, Class385.aClass385_934, Class385.aClass385_683, Class385.aClass385_361, Class385.aClass385_393, Class385.aClass385_1106, Class385.aClass385_959, Class385.aClass385_1054, Class385.aClass385_1039, Class385.aClass385_916, Class385.aClass385_1031, Class385.aClass385_937, Class385.aClass385_156, Class385.aClass385_521, Class385.aClass385_498, Class385.aClass385_850, Class385.aClass385_230, Class385.aClass385_363, Class385.aClass385_90, Class385.aClass385_1014, Class385.aClass385_100, Class385.aClass385_198, Class385.aClass385_1134, Class385.aClass385_177, Class385.aClass385_592, Class385.aClass385_121, Class385.aClass385_1025, Class385.aClass385_1111, Class385.aClass385_671, Class385.aClass385_94, Class385.aClass385_171, Class385.aClass385_144, Class385.aClass385_435, Class385.aClass385_542, Class385.aClass385_1062, Class385.aClass385_157, Class385.aClass385_54, Class385.aClass385_773, Class385.aClass385_724, Class385.aClass385_176, Class385.aClass385_346, Class385.aClass385_1127, Class385.aClass385_944, Class385.aClass385_632, Class385.aClass385_519, Class385.aClass385_12, Class385.aClass385_562, Class385.aClass385_940, Class385.aClass385_368, Class385.aClass385_339, Class385.aClass385_591, Class385.aClass385_88, Class385.aClass385_1058, Class385.aClass385_487, Class385.aClass385_513, Class385.aClass385_1094, Class385.aClass385_550, Class385.aClass385_975, Class385.aClass385_690, Class385.aClass385_51, Class385.aClass385_1009, Class385.aClass385_877, Class385.aClass385_699, Class385.aClass385_990, Class385.aClass385_431, Class385.aClass385_223, Class385.aClass385_133, Class385.aClass385_758, Class385.aClass385_573, Class385.aClass385_438, Class385.aClass385_634, Class385.aClass385_546, Class385.aClass385_260, Class385.aClass385_183, Class385.aClass385_787, Class385.aClass385_657, Class385.aClass385_124, Class385.aClass385_920, Class385.aClass385_382, Class385.aClass385_995, Class385.aClass385_347, Class385.aClass385_1081, Class385.aClass385_91, Class385.aClass385_458, Class385.aClass385_153, Class385.aClass385_294, Class385.aClass385_855, Class385.aClass385_1135, Class385.aClass385_620, Class385.aClass385_982, Class385.aClass385_471, Class385.aClass385_1069, Class385.aClass385_429, Class385.aClass385_889, Class385.aClass385_686, Class385.aClass385_441, Class385.aClass385_149, Class385.aClass385_292, Class385.aClass385_908, Class385.aClass385_202, Class385.aClass385_430, Class385.aClass385_268, Class385.aClass385_16, Class385.aClass385_89, Class385.aClass385_22, Class385.aClass385_360, Class385.aClass385_269, Class385.aClass385_114, Class385.aClass385_570, Class385.aClass385_707, Class385.aClass385_428, Class385.aClass385_1068, Class385.aClass385_839, Class385.aClass385_1059, Class385.aClass385_561, Class385.aClass385_231, Class385.aClass385_304, Class385.aClass385_208, Class385.aClass385_1027, Class385.aClass385_340, Class385.aClass385_582, Class385.aClass385_903, Class385.aClass385_991, Class385.aClass385_423, Class385.aClass385_754, Class385.aClass385_127, Class385.aClass385_581, Class385.aClass385_516, Class385.aClass385_108 };
	}

	@OriginalMember(owner = "client!mb", name = "br", descriptor = "(IB)Z", line = 1434)
	static boolean method25830(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!mb", name = "gn", descriptor = "(I)V", line = 2756)
	static final void method25826() {
		if (client.anInt3041 * -1578833007 > 1) {
			client.anInt3041 -= 616510833;
			client.anInt3152 = client.anInt3138 * -218385621;
		}
		if (client.aClass82_2.aBoolean531) {
			client.aClass82_2.aBoolean531 = false;
			Class486.method29181();
			return;
		}
		if (!Class250.aBoolean688) {
			Class463.method28610();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Class21_Sub1.method3214(client.aClass82_2); local27++) {
		}
		if (client.anInt3039 * 1115111877 != 5) {
			return;
		}
		@Pc(63) int local63;
		@Pc(52) Class3_Sub23 local52;
		while (Class207.method24224()) {
			local52 = Class269.method25284(Class311.aClass311_114, client.aClass82_2.aClass577_2);
			local52.aClass3_Sub41_Sub1_1.method20250(0);
			local63 = local52.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
			Class351.method26587(local52.aClass3_Sub41_Sub1_1);
			local52.aClass3_Sub41_Sub1_1.method20266(local52.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local63);
			client.aClass82_2.method21601(local52);
		}
		@Pc(130) int local130;
		if (Class413.aClass507_1 == null) {
			if (Class176.method23413() >= Class230.aLong247 * -6958054129942580509L) {
				Class413.aClass507_1 = client.aClass508_1.method29556(FileFilter_Sub1.aClass585_1.aString242);
			}
		} else if (Class413.aClass507_1.anInt5256 * 1101732247 != -1) {
			local52 = Class269.method25284(Class311.aClass311_83, client.aClass82_2.aClass577_2);
			if (Class196.aGarbageCollectorMXBean1 == null || !Class196.aGarbageCollectorMXBean1.isValid()) {
				try {
					@Pc(106) Iterator local106 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (local106.hasNext()) {
						@Pc(113) GarbageCollectorMXBean local113 = (GarbageCollectorMXBean) local106.next();
						if (local113.isValid()) {
							Class196.aGarbageCollectorMXBean1 = local113;
							client.aLong235 = 6839167247506787367L;
							client.aLong236 = 2700600983166206589L;
						}
					}
				} catch (@Pc(125) Throwable local125) {
				}
			}
			@Pc(128) long local128 = Class176.method23413();
			local130 = -1;
			if (Class196.aGarbageCollectorMXBean1 != null) {
				@Pc(136) long local136 = Class196.aGarbageCollectorMXBean1.getCollectionTime();
				if (client.aLong236 * 8187857084828367147L != -1L) {
					@Pc(148) long local148 = local136 - client.aLong236 * 8187857084828367147L;
					@Pc(154) long local154 = local128 - client.aLong235 * 2090995473753578601L;
					if (local154 != 0L) {
						local130 = (int) (local148 * 100L / local154);
					}
				}
				client.aLong236 = local136 * -2700600983166206589L;
				client.aLong235 = local128 * -6839167247506787367L;
			}
			local52.aClass3_Sub41_Sub1_1.method20318(Class413.aClass507_1.anInt5256 * 1101732247);
			local52.aClass3_Sub41_Sub1_1.method20250(local130);
			local52.aClass3_Sub41_Sub1_1.method20302(client.anInt3019 * 1617726299);
			client.aClass82_2.method21601(local52);
			Class413.aClass507_1 = null;
			Class230.aLong247 = (local128 + 30000L) * -264897737678413109L;
		}
		Class273.method25344();
		Class18.method17008();
		@Pc(228) Class3_Sub22 local228 = (Class3_Sub22) client.aClass553_43.method32768();
		if (client.aClass370_1.method26950() != null) {
			if (Class72.anInt2086 * 81180077 == 2) {
				Class13_Sub13.method6522();
			} else if (Class72.anInt2086 * 81180077 == 1) {
				Class16.method1679();
			}
		}
		if (client.aBoolean602) {
			client.aBoolean602 = false;
		} else {
			client.aFloat240 /= 2.0F;
		}
		if (client.aBoolean585) {
			client.aBoolean585 = false;
		} else {
			client.aFloat239 /= 2.0F;
		}
		@Pc(287) int local287;
		if (Class150.method23135()) {
			Class62.method12865();
		} else if (Class72.anInt2086 * 81180077 == 3) {
			@Pc(280) Class464 local280 = client.aClass370_1.method26942();
			local287 = local280.anInt5071 * -1567811631 << 9;
			local130 = local280.anInt5073 * 1360175441 << 9;
			if (Class443.aLong271 * -1867496837733217357L <= 0L) {
				Class443.aLong271 = Class176.method23413() * -2121688669535298693L;
			}
			@Pc(313) float local313 = (float) (Class176.method23413() - Class443.aLong271 * -1867496837733217357L);
			@Pc(318) int local318 = 1000 / Class498.method29361();
			@Pc(324) int local324 = (int) ((double) local318 * 1.25D);
			while (local313 > 0.0F) {
				@Pc(333) float local333 = Math.min(local313, (float) local324);
				Class80.aClass23_Sub1_1.method5896(local333 / 1000.0F, client.aClass370_1.method26959().anIntArrayArrayArray14, client.aClass370_1.method27075(), local287, local130);
				local313 -= local324;
			}
			Class443.aLong271 = Class176.method23413() * -2121688669535298693L;
		}
		Class224.method24457();
		if (client.anInt3039 * 1115111877 != 5) {
			return;
		}
		client.aClass370_1.method26953().method28896(client.aClass370_1);
		Class84.method21634();
		if (client.anInt3045 * -743218487 > 10) {
			client.aClass82_2.anInt2918 += 1231224825;
		}
		if (client.aClass82_2.anInt2918 * 1464963657 > 2250) {
			Class486.method29181();
			return;
		}
		if (client.anInt3065 * -1773414811 == 4) {
			Class569.method33006();
			Class500.method29440();
		} else if (Class61.aClass495_2.anInterface50_5.method28750(local228, client.anInterface46Array2, client.anInt3144 * 259780257, Class217.aClass65_1)) {
			Class43.method9505(false);
		} else {
			if (client.anInt3065 * -1773414811 == 0 && Class401.method27609(client.anInt3064 * 1358073379)) {
				client.aClass370_1.method26969(new Class374(Class380.aClass380_4, null));
				client.anInt3065 = -1772360851;
			}
			if (client.anInt3065 * -1773414811 == 1 && client.anInt3039 * 1115111877 != 7) {
				Class131.aClass581_23.method33222();
				client.anInt3065 = 750245594;
				client.anInt3066 = client.anInt3034 * -1566474149;
				client.anInt3067 = 0;
				client.aBoolean582 = false;
				Class558.method32816();
			}
			if (client.anInt3065 * -1773414811 == 2) {
				local63 = client.anInt3034 - client.anInt3066 * 1937747923;
				if (client.anInt3067 * -1742306563 < Class496.aClass13Array1.length) {
					do {
						@Pc(488) Class13 local488 = Class496.aClass13Array1[client.anInt3067 * -1742306563];
						if (local488.anInt2437 * -564743863 > local63) {
							break;
						}
						local488.method16888();
					} while (client.anInt3065 * -1773414811 == 2 && (client.anInt3067 += 879569493) * -1742306563 < Class496.aClass13Array1.length);
				}
				if (client.anInt3065 * -1773414811 == 2) {
					for (local287 = 0; local287 < Class131.aClass163Array1.length; local287++) {
						@Pc(530) Class163 local530 = Class131.aClass163Array1[local287];
						if (local530.aBoolean623) {
							@Pc(538) Class26_Sub1_Sub1_Sub1 local538 = local530.method23278();
							Class536.method32541(local538, true);
						}
					}
				}
			}
		}
		Class173.method23389();
		Class453.method28436();
		Class491.method29254();
		Class591.method33334(false);
		Class509.method29575(Class613.aClass21_13, Class43_Sub5.aClass134_5);
		client.anInt3124 += 991475191;
		if (client.anInt3105 * -963655717 != 0) {
			client.anInt3104 += -1346779380;
			if (client.anInt3104 * -321576297 >= 400) {
				client.anInt3105 = 0;
			}
		}
		if (Class485.aClass178_17 != null) {
			client.anInt3106 += -268807793;
			if (client.anInt3106 * 1922542959 >= 15) {
				Class223.method24442(Class485.aClass178_17);
				Class485.aClass178_17 = null;
			}
		}
		client.aClass178_9 = null;
		client.aBoolean603 = false;
		client.aBoolean601 = false;
		Class19_Sub1.aClass178_8 = null;
		Class295.method25567(null, -1, -1);
		if (!client.aBoolean596) {
			client.anInt3159 = -1299803289;
		}
		Class126.method22875();
		client.anInt3138 += 667630385;
		@Pc(625) Class3_Sub23 local625;
		if (client.aBoolean605) {
			local625 = Class269.method25284(Class311.aClass311_35, client.aClass82_2.aClass577_2);
			local625.aClass3_Sub41_Sub1_1.method20353(Class174.anInt3472 * 1730277407 << 28 | Class498.anInt5231 * -1196666545 << 14 | Class568.anInt5380 * 1625585381);
			client.aClass82_2.method21601(local625);
			client.aBoolean605 = false;
		}
		while (true) {
			@Pc(655) Class3_Sub17 local655;
			@Pc(661) Class178 local661;
			@Pc(673) Class178 local673;
			do {
				local655 = (Class3_Sub17) client.aClass553_46.method32718();
				if (local655 == null) {
					while (true) {
						do {
							local655 = (Class3_Sub17) client.aClass553_47.method32718();
							if (local655 == null) {
								while (true) {
									do {
										local655 = (Class3_Sub17) client.aClass553_45.method32718();
										if (local655 == null) {
											if (Class19_Sub1.aClass178_8 == null) {
												client.anInt3143 = 0;
											}
											if (client.aClass178_13 != null) {
												Class170.method23362();
											}
											Class71_Sub3.method20104();
											if (client.anInt3116 * -1336253523 > 0 && Class217.aClass65_1.method13145(82) && Class217.aClass65_1.method13145(81) && client.anInt3098 * -1965800379 != 0) {
												local63 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 - client.anInt3098 * -1965800379;
												if (local63 < 0) {
													local63 = 0;
												} else if (local63 > 3) {
													local63 = 3;
												}
												@Pc(854) Class464 local854 = client.aClass370_1.method26942();
												Class194.method24081(local63, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] + local854.anInt5071 * -1567811631, local854.anInt5073 * 1360175441 + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0]);
											}
											for (local63 = 0; local63 < 5; local63++) {
												@Pc(884) int local884 = client.anIntArray319[local63]++;
											}
											if (Class302.aClass10_Sub1_1.aBoolean15 && Class302.aClass10_Sub1_1.aLong6 * -5220939323328680079L < Class176.method23413() - 60000L) {
												Class43_Sub4.method9306();
											}
											Class302.aClass10_Sub1_1.method727();
											for (@Pc(912) Class53_Sub5 local912 = (Class53_Sub5) client.aClass559_8.method32822(); local912 != null; local912 = (Class53_Sub5) client.aClass559_8.method32837()) {
												if ((long) (local912.anInt1192 * -1830700619) < Class176.method23413() / 1000L - 5L) {
													if (local912.aShort50 > 0) {
														Class121.method22823(5, 0, "", "", "", local912.aString43 + Class601.aClass601_128.method33512(Class469.aClass530_2));
													}
													if (local912.aShort50 == 0) {
														Class121.method22823(5, 0, "", "", "", local912.aString43 + Class601.aClass601_129.method33512(Class469.aClass530_2));
													}
													local912.method20615();
												}
											}
											client.anInt3080 += -159626147;
											if (client.anInt3080 * 1350559733 > 500) {
												client.anInt3080 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3075 += client.anInt3076 * -775210751;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3077 += client.anInt3129 * -307842187;
												}
												if ((local63 & 0x4) == 4) {
													client.anInt3079 += client.anInt3110 * -1674821227;
												}
											}
											if (client.anInt3075 * -1002831869 < -50) {
												client.anInt3076 = -188403882;
											}
											if (client.anInt3075 * -1002831869 > 54) {
												client.anInt3076 = 188403882;
											}
											if (client.anInt3077 * -1467006729 < -63) {
												client.anInt3129 = -1315565674;
											}
											if (client.anInt3077 * -1467006729 > 56) {
												client.anInt3129 = 1315565674;
											}
											if (client.anInt3079 * -872004161 < -40) {
												client.anInt3110 = 2076831619;
											}
											if (client.anInt3079 * -872004161 > 44) {
												client.anInt3110 = -2076831619;
											}
											client.anInt3164 += 425501781;
											if (client.anInt3164 * 1149450493 > 503) {
												client.anInt3164 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3081 += client.anInt3102 * -392217761;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3083 += client.anInt3084 * -1443599057;
												}
											}
											if (client.anInt3081 * 732347007 < -65) {
												client.anInt3102 = -1774382142;
											}
											if (client.anInt3081 * 732347007 > 60) {
												client.anInt3102 = 1774382142;
											}
											if (client.anInt3083 * 1898621565 < -20) {
												client.anInt3084 = -1848796357;
											}
											if (client.anInt3083 * 1898621565 > 12) {
												client.anInt3084 = 1848796357;
											}
											client.aClass82_2.anInt2919 += -1363934375;
											if (client.aClass82_2.anInt2919 * 2119570665 > 50) {
												local625 = Class269.method25284(Class311.aClass311_89, client.aClass82_2.aClass577_2);
												client.aClass82_2.method21601(local625);
											}
											if (client.aBoolean581) {
												Class473.method28779();
												client.aBoolean581 = false;
											}
											try {
												client.aClass82_2.method21617();
											} catch (@Pc(1171) IOException local1171) {
												Class486.method29181();
											}
											return;
										}
										local661 = local655.aClass178_2;
										if (local661.anInt3491 * 18828465 < 0) {
											break;
										}
										local673 = Class375.method27235(local661.anInt3500 * 610124465);
									} while (local673 == null || local673.aClass178Array5 == null || local661.anInt3491 * 18828465 >= local673.aClass178Array5.length || local661 != local673.aClass178Array5[local661.anInt3491 * 18828465]);
									Class410.method27671(local655);
								}
							}
							local661 = local655.aClass178_2;
							if (local661.anInt3491 * 18828465 < 0) {
								break;
							}
							local673 = Class375.method27235(local661.anInt3500 * 610124465);
						} while (local673 == null || local673.aClass178Array5 == null || local661.anInt3491 * 18828465 >= local673.aClass178Array5.length || local661 != local673.aClass178Array5[local661.anInt3491 * 18828465]);
						Class410.method27671(local655);
					}
				}
				local661 = local655.aClass178_2;
				if (local661.anInt3491 * 18828465 < 0) {
					break;
				}
				local673 = Class375.method27235(local661.anInt3500 * 610124465);
			} while (local673 == null || local673.aClass178Array5 == null || local661.anInt3491 * 18828465 >= local673.aClass178Array5.length || local661 != local673.aClass178Array5[local661.anInt3491 * 18828465]);
			Class410.method27671(local655);
		}
	}

	@OriginalMember(owner = "client!mb", name = "at", descriptor = "(Lclient!vs;I)V", line = 3994)
	static final void method25823(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		if (arg0.anIntArray496[arg0.anInt5319 * 960738381] < arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[-2140198955 * arg0.anInt5318] * -836839043;
		}
	}

	@OriginalMember(owner = "client!mb", name = "hl", descriptor = "(Lclient!vs;B)V", line = 5508)
	static final void method25827(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class148.method23116(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "pk", descriptor = "(Lclient!vs;I)V", line = 6848)
	static final void method25824(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3499 * -751005789;
	}

	@OriginalMember(owner = "client!mb", name = "xp", descriptor = "(Lclient!vs;I)V", line = 8281)
	static final void method25825(@OriginalArg(0) Class536 arg0) {
		if (client.anInt3194 * 963130851 == 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -2;
		} else if (client.anInt3194 * 963130851 == 1) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3042 * -1645830611;
		}
	}
}
