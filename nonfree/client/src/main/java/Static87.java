import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	public static int anInt1748;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "Lclient!hba;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_27 = new Class337(1, -1);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!gh;B)V")
	public static void method1410(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.aClass4_Sub2_9 = null;
		@Pc(12) int local12 = arg0.aClass4_Sub9Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass4_Sub9Array1[local14].aBoolean558 = false;
		}
		@Pc(28) Class99[] local28 = Class216.aClass99Array1;
		synchronized (Class216.aClass99Array1) {
			if (Class216.aClass99Array1.length > local12 && Static308.anIntArray378[local12] < 200) {
				Class216.aClass99Array1[local12].method2039(arg0);
				@Pc(53) int local53 = Static308.anIntArray378[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public static int method1414() {
		return Static483.anInt8236 == 1 ? Static447.anInt7618 : Static517.anInt8880;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!la;ILclient!la;Z)V")
	public static void method1417(@OriginalArg(0) Class207 arg0, @OriginalArg(2) Class207 arg1) {
		Static561.aClass207_118 = arg1;
		Static427.aClass207_85 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method1419(@OriginalArg(0) Class133 arg0) {
		for (@Pc(11) Class4_Sub4 local11 = (Class4_Sub4) Static340.aClass99_6.method2045(); local11 != null; local11 = (Class4_Sub4) Static340.aClass99_6.method2047()) {
			if (local11.aBoolean175) {
				local11.method1958(arg0);
			}
		}
	}
}
