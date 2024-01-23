import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!ia;")
	private static Class51 aClass51_716 = Static64.method1101("Loaded sprites");

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!ia;")
	public static Class51 aClass51_717 = Static64.method1101("huffman");

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!ia;")
	public static Class51 aClass51_718 = aClass51_716;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public static void method1603(@OriginalArg(0) boolean arg0) {
		if (Static81.aClass11_15 == null) {
			return;
		}
		try {
			@Pc(11) Class1_Sub16 local11 = new Class1_Sub16(4);
			local11.method3765(arg0 ? 2 : 3);
			local11.method3761(0);
			Static81.aClass11_15.method269(4, local11.aByteArray62);
		} catch (@Pc(34) IOException local34) {
			try {
				Static81.aClass11_15.method271();
			} catch (@Pc(39) Exception local39) {
			}
			Static71.anInt1634++;
			Static81.aClass11_15 = null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)I")
	public static int method1605(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	public static void method1606() {
		@Pc(14) int local14 = Static225.aClass1_Sub16_Sub1_4.method3824(8);
		@Pc(19) int local19;
		if (Static118.anInt2542 > local14) {
			for (local19 = local14; local19 < Static118.anInt2542; local19++) {
				Static61.anIntArray91[Static37.anInt896++] = Static79.anIntArray111[local19];
			}
		}
		if (Static118.anInt2542 < local14) {
			throw new RuntimeException("gppov1");
		}
		Static118.anInt2542 = 0;
		for (local19 = 0; local19 < local14; local19++) {
			@Pc(61) int local61 = Static79.anIntArray111[local19];
			@Pc(65) Class5_Sub1_Sub1 local65 = Static191.aClass5_Sub1_Sub1Array1[local61];
			@Pc(70) int local70 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
			if (local70 == 0) {
				Static79.anIntArray111[Static118.anInt2542++] = local61;
				local65.anInt3627 = Static109.anInt2430;
			} else {
				@Pc(93) int local93 = Static225.aClass1_Sub16_Sub1_4.method3824(2);
				if (local93 == 0) {
					Static79.anIntArray111[Static118.anInt2542++] = local61;
					local65.anInt3627 = Static109.anInt2430;
					Static145.anIntArray216[Static226.anInt4738++] = local61;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local93 == 1) {
						Static79.anIntArray111[Static118.anInt2542++] = local61;
						local65.anInt3627 = Static109.anInt2430;
						local140 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
						local65.method2795(local140, false);
						local150 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
						if (local150 == 1) {
							Static145.anIntArray216[Static226.anInt4738++] = local61;
						}
					} else if (local93 == 2) {
						Static79.anIntArray111[Static118.anInt2542++] = local61;
						local65.anInt3627 = Static109.anInt2430;
						local140 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
						local65.method2795(local140, true);
						local150 = Static225.aClass1_Sub16_Sub1_4.method3824(3);
						local65.method2795(local150, true);
						@Pc(204) int local204 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
						if (local204 == 1) {
							Static145.anIntArray216[Static226.anInt4738++] = local61;
						}
					} else if (local93 == 3) {
						Static61.anIntArray91[Static37.anInt896++] = local61;
					}
				}
			}
		}
	}
}
