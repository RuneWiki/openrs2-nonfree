import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
	public static int anInt667;

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
	public static final int anInt657 = 1406;

	@OriginalMember(owner = "client!dl", name = "U", descriptor = "[I")
	public static final int[] anIntArray64 = new int[25];

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "(I)[Lclient!qfa;")
	public static Class272[] method523() {
		return new Class272[] { Static596.aClass272_274, Static44.aClass272_36, Static522.aClass272_253, Static145.aClass272_89, Static71.aClass272_47, Static79.aClass272_50, Static442.aClass272_261, Static458.aClass272_230, Static83.aClass272_52, Static314.aClass272_172, Static464.aClass272_234, Static350.aClass272_246, Static110.aClass272_71, Static461.aClass272_231, Static308.aClass272_166, Static466.aClass272_266, Static319.aClass272_174, Static147.aClass272_92, Static162.aClass272_96, Static139.aClass272_86, Static45.aClass272_37, Static310.aClass272_168, Static524.aClass272_254, Static299.aClass272_163, Static118.aClass272_76, Static365.aClass272_275, Static182.aClass272_106, Static466.aClass272_265, Static424.aClass272_222, Static357.aClass272_194, Static201.aClass272_122, Static232.aClass272_136, Static312.aClass272_170, Static358.aClass272_270, Static396.aClass272_208, Static341.aClass272_185, Static532.aClass272_257, Static22.aClass272_19, Static375.aClass272_203, Static413.aClass272_217, Static108.aClass272_63, Static513.aClass272_247, Static392.aClass272_211, Static471.aClass272_237, Static265.aClass272_153, Static393.aClass272_213, Static446.aClass272_227, Static164.aClass272_100, Static355.aClass272_189, Static190.aClass272_113, Static510.aClass272_245, Static288.aClass272_159, Static57.aClass272_40, Class9_Sub1_Sub1_Sub4.lb, Static514.aClass272_248, Static391.aClass272_210, Static103.aClass272_61, Static247.aClass272_146, Static59.aClass272_158, Static560.aClass272_264, Static129.aClass272_77, Static74.aClass272_49, Static140.aClass272_243, Static577.aClass272_115, Static595.aClass272_273, Static210.aClass272_126, Static316.aClass272_268, Static527.aClass272_256, Static517.aClass272_251, Static468.aClass272_235, Static381.aClass272_207, Static323.aClass272_271, Static505.aClass272_81, Static203.aClass272_123, Static107.aClass272_209, Static102.aClass272_34, Static353.aClass272_188, Static279.aClass272_156, Static492.aClass272_184, Static322.aClass272_177, Static113.aClass272_72, Static84.aClass272_53, Static500.aClass272_244, Static253.aClass272_149, Static115.aClass272_73, Static191.aClass272_116, Static488.aClass272_239, Static590.aClass272_272, Static257.aClass272_151, Static161.aClass272_95, Static29.aClass272_22, Static558.aClass272_263, Static227.aClass272_134, Static139.aClass272_85, Static13.aClass272_195, Static92.aClass272_59, Static568.aClass272_267, Static539.aClass272_173, Static280.aClass272_157, Static209.aClass272_250, Static463.aClass272_233, Static234.aClass272_137, Static144.aClass272_88, Static196.aClass272_119, Static2.aClass272_1, Static67.aClass272_44, Static42.aClass272_35, Static348.aClass272_187, Static147.aClass272_93, Static220.aClass272_130, Static516.aClass272_249, Static374.aClass272_202, Static188.aClass272_110, Static242.aClass272_141, Static87.aClass272_57, Static553.aClass272_262, Static249.aClass272_147 };
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!bw;I)V")
	public static void method524(@OriginalArg(0) Class3_Sub11_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method992();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static476.anInt8277; local12++) {
			local18 = Static10.anIntArray19[local12];
			if ((Static297.aByteArray60[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static297.aByteArray60[local18] = (byte) (Static297.aByteArray60[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method990(1);
					if (local46 == 0) {
						local7 = Static523.method7827(arg0);
						Static297.aByteArray60[local18] = (byte) (Static297.aByteArray60[local18] | 0x2);
					} else {
						Static115.method2380(arg0, local18);
					}
				}
			}
		}
		arg0.method989();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method992();
		@Pc(123) int local123;
		for (local18 = 0; local18 < Static476.anInt8277; local18++) {
			local46 = Static10.anIntArray19[local18];
			if ((Static297.aByteArray60[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static297.aByteArray60[local46] = (byte) (Static297.aByteArray60[local46] | 0x2);
					local7--;
				} else {
					local123 = arg0.method990(1);
					if (local123 == 0) {
						local7 = Static523.method7827(arg0);
						Static297.aByteArray60[local46] = (byte) (Static297.aByteArray60[local46] | 0x2);
					} else {
						Static115.method2380(arg0, local46);
					}
				}
			}
		}
		arg0.method989();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method992();
		@Pc(194) int local194;
		for (local46 = 0; local46 < Static524.anInt8287; local46++) {
			local123 = Static49.anIntArray94[local46];
			if ((Static297.aByteArray60[local123] & 0x1) != 0) {
				if (local7 > 0) {
					Static297.aByteArray60[local123] = (byte) (Static297.aByteArray60[local123] | 0x2);
					local7--;
				} else {
					local194 = arg0.method990(1);
					if (local194 == 0) {
						local7 = Static523.method7827(arg0);
						Static297.aByteArray60[local123] = (byte) (Static297.aByteArray60[local123] | 0x2);
					} else if (Static400.method5835(arg0, local123)) {
						Static297.aByteArray60[local123] = (byte) (Static297.aByteArray60[local123] | 0x2);
					}
				}
			}
		}
		arg0.method989();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method992();
		for (local123 = 0; local123 < Static524.anInt8287; local123++) {
			local194 = Static49.anIntArray94[local123];
			if ((Static297.aByteArray60[local194] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static297.aByteArray60[local194] = (byte) (Static297.aByteArray60[local194] | 0x2);
				} else {
					@Pc(284) int local284 = arg0.method990(1);
					if (local284 == 0) {
						local7 = Static523.method7827(arg0);
						Static297.aByteArray60[local194] = (byte) (Static297.aByteArray60[local194] | 0x2);
					} else if (Static400.method5835(arg0, local194)) {
						Static297.aByteArray60[local194] = (byte) (Static297.aByteArray60[local194] | 0x2);
					}
				}
			}
		}
		arg0.method989();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static524.anInt8287 = 0;
		Static476.anInt8277 = 0;
		for (local194 = 1; local194 < 2048; local194++) {
			Static297.aByteArray60[local194] = (byte) (Static297.aByteArray60[local194] >> 1);
			@Pc(354) Class9_Sub1_Sub1_Sub2_Sub2 local354 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local194];
			if (local354 == null) {
				Static49.anIntArray94[Static524.anInt8287++] = local194;
			} else {
				Static10.anIntArray19[Static476.anInt8277++] = local194;
			}
		}
	}
}
