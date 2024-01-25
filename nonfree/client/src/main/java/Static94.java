import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
	public static int anInt2045;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_22 = new Class242("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
	public static final int[] anIntArray127 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_48 = new Class36(19, 4);

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
	public static int anInt2046 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
	public static int method1540() {
		try {
			if (Static433.anInt7201 == 0) {
				if (Static114.aLong59 > Static199.method2845() - 5000L) {
					return 0;
				}
				Static59.aClass108_3 = Static89.aClass114_3.method2364(Static224.anInt4140, Static220.aString53);
				Static438.aLong215 = Static199.method2845();
				Static433.anInt7201 = 1;
			}
			if (Static438.aLong215 + 30000L < Static199.method2845()) {
				return Static64.method5816(1000);
			}
			@Pc(75) int local75;
			@Pc(105) int local105;
			if (Static433.anInt7201 == 1) {
				if (Static59.aClass108_3.anInt2803 == 2) {
					return Static64.method5816(1001);
				}
				if (Static59.aClass108_3.anInt2803 != 1) {
					return -1;
				}
				Static223.aClass5_3 = new Class5((Socket) Static59.aClass108_3.anObject4, Static89.aClass114_3);
				Static59.aClass108_3 = null;
				local75 = 0;
				Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
				if (Static398.aBoolean455) {
					local75 = Static154.anInt2952;
				}
				Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_19.anInt6527);
				Static116.aClass4_Sub30_Sub1_1.method4861(local75);
				Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, Static116.aClass4_Sub30_Sub1_1.anInt6244);
				Static194.method2825();
				local105 = Static223.aClass5_3.method125();
				Static194.method2825();
				if (local105 != 0) {
					return Static64.method5816(local105);
				}
				Static433.anInt7201 = 2;
			}
			if (Static433.anInt7201 == 2) {
				if (Static223.aClass5_3.method120() < 2) {
					return -1;
				}
				Static276.anInt4862 = Static223.aClass5_3.method125();
				Static276.anInt4862 <<= 0x8;
				Static276.anInt4862 += Static223.aClass5_3.method125();
				Static433.anInt7201 = 3;
				Static364.anInt6461 = 0;
				Static313.aByteArray65 = new byte[Static276.anInt4862];
			}
			if (Static433.anInt7201 != 3) {
				return -1;
			}
			local75 = Static223.aClass5_3.method120();
			if (local75 < 1) {
				return -1;
			}
			if (Static276.anInt4862 - Static364.anInt6461 < local75) {
				local75 = Static276.anInt4862 - Static364.anInt6461;
			}
			Static223.aClass5_3.method122(Static313.aByteArray65, local75, Static364.anInt6461);
			Static364.anInt6461 += local75;
			if (Static276.anInt4862 > Static364.anInt6461) {
				return -1;
			} else if (Static19.method435(Static313.aByteArray65)) {
				Static190.aClass84_Sub1Array1 = new Class84_Sub1[Static218.anInt3837];
				local105 = 0;
				for (@Pc(210) int local210 = Static355.anInt6373; local210 <= Static230.anInt4220; local210++) {
					@Pc(216) Class84_Sub1 local216 = Static246.method3391(local210);
					if (local216 != null) {
						Static190.aClass84_Sub1Array1[local105++] = local216;
					}
				}
				Static284.anInt5184 = 0;
				Static405.aClass4_Sub6_2 = null;
				Static223.aClass5_3.method119();
				Static257.anInt4643 = 0;
				Static223.aClass5_3 = null;
				Static313.aByteArray65 = null;
				Static433.anInt7201 = 0;
				Static114.aLong59 = Static199.method2845();
				return 0;
			} else {
				return Static64.method5816(1002);
			}
		} catch (@Pc(248) IOException local248) {
			return Static64.method5816(1003);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B[Lclient!fk;Lclient!bv;)Lclient!rs;")
	public static Class210 method1545(@OriginalArg(1) Class79[] arg0, @OriginalArg(2) Class30_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] == null || arg0[local12].aLong60 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg0[local42].aLong60);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static115.anIntArray162, 0);
		if (Static115.anIntArray162[0] == 0) {
			if (Static115.anIntArray162[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static115.anIntArray162, 1);
			if (Static115.anIntArray162[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static115.anIntArray162[1]];
				OpenGL.glGetInfoLogARB(local40, Static115.anIntArray162[1], Static115.anIntArray162, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static115.anIntArray162[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg0.length; local119++) {
					OpenGL.glDetachObjectARB(local40, arg0[local119].aLong60);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class210(arg1, local40, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(IB)V")
	public static void method1546(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static416.method5456(arg0, 8);
		local13.method2761();
	}
}
