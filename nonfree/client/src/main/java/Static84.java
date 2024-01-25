import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
	public static int anInt8888 = -1;

	@OriginalMember(owner = "client!dga", name = "y", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "Lclient!kea;")
	public static final Class187 aClass187_40 = new Class187(64);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILclient!qaa;)Z")
	public static boolean method7265(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub35_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method5806(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (local8 == 0) {
			if (arg1.method5806(1) != 0) {
				method7265(arg0, arg1);
			}
			local31 = arg1.method5806(6);
			local36 = arg1.method5806(6);
			@Pc(48) boolean local48 = arg1.method5806(1) == 1;
			if (local48) {
				Static295.anIntArray391[Static172.anInt3031++] = arg0;
			}
			if (Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class296 local71 = Static511.aClass296Array1[arg0];
			@Pc(79) Class8_Sub3_Sub3_Sub1_Sub1 local79 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[arg0] = new Class8_Sub3_Sub3_Sub1_Sub1();
			local79.anInt6821 = arg0;
			if (Static510.aClass1_Sub35Array1[arg0] != null) {
				local79.method1443(Static510.aClass1_Sub35Array1[arg0]);
			}
			local79.method5435(local71.anInt7949, true);
			local79.anInt6781 = local71.anInt7950;
			local105 = local71.anInt7951;
			local109 = local105 >> 28;
			local115 = local105 >> 14 & 0xFF;
			@Pc(119) int local119 = local105 & 0xFF;
			@Pc(128) int local128 = local31 + (local115 << 6) - Static541.anInt9058;
			@Pc(137) int local137 = local36 + (local119 << 6) - Static116.anInt2289;
			local79.aBoolean137 = local71.aBoolean612;
			local79.aByteArray82[0] = Static500.aByteArray97[arg0];
			local79.aByte123 = local79.aByte124 = (byte) local109;
			if (Static466.method6426(local137, local128)) {
				local79.aByte124++;
			}
			local79.method1444(local137, local128);
			local79.aBoolean135 = false;
			Static511.aClass296Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg1.method5806(2);
			local36 = Static511.aClass296Array1[arg0].anInt7951;
			Static511.aClass296Array1[arg0].anInt7951 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(232) int local232;
			@Pc(237) int local237;
			@Pc(245) int local245;
			if (local8 != 2) {
				local31 = arg1.method5806(18);
				local36 = local31 >> 16;
				local232 = local31 >> 8 & 0xFF;
				local237 = local31 & 0xFF;
				local245 = Static511.aClass296Array1[arg0].anInt7951;
				local105 = (local245 >> 28) + local36 & 0x3;
				local109 = local232 + (local245 >> 14) & 0xFF;
				local115 = local237 + local245 & 0xFF;
				Static511.aClass296Array1[arg0].anInt7951 = local115 + (local105 << 28) + (local109 << 14);
				return false;
			}
			local31 = arg1.method5806(5);
			local36 = local31 >> 3;
			local232 = local31 & 0x7;
			local237 = Static511.aClass296Array1[arg0].anInt7951;
			local245 = (local237 >> 28) + local36 & 0x3;
			local105 = local237 >> 14 & 0xFF;
			local109 = local237 & 0xFF;
			if (local232 == 0) {
				local109--;
				local105--;
			}
			if (local232 == 1) {
				local109--;
			}
			if (local232 == 2) {
				local109--;
				local105++;
			}
			if (local232 == 3) {
				local105--;
			}
			if (local232 == 4) {
				local105++;
			}
			if (local232 == 5) {
				local105--;
				local109++;
			}
			if (local232 == 6) {
				local109++;
			}
			if (local232 == 7) {
				local109++;
				local105++;
			}
			Static511.aClass296Array1[arg0].anInt7951 = local109 + (local105 << 14) + (local245 << 28);
			return false;
		}
	}
}
