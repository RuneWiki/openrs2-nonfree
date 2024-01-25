import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "[Lclient!pf;")
	public static Class44_Sub4[] aClass44_Sub4Array1;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_4 = new Class70(256);

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "[I")
	public static final int[] anIntArray15 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lclient!js;")
	public static Class44_Sub5 method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass44_Sub5_1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method163(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static332.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static337.aClass198_1);
		arg0.addFocusListener(Static337.aClass198_1);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
	public static void method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class154[] local3 = Static330.aClass154Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class154 local11 = local3[local5];
			if (local11 != null && local11.anInt4211 == 2) {
				Static6.method119(local11.anInt4213 * 2, local11.anInt4214 + (local11.anInt4212 - Static300.anInt5672 << 7), (local11.anInt4208 + -Static44.anInt881 << 7) + local11.anInt4205, arg3 >> 1, arg0 >> 1);
				if (Static158.anIntArray632[0] > -1 && Static76.anInt2853 % 20 < 10) {
					Static94.aClass40Array16[local11.anInt4219].method5077(arg1 + Static158.anIntArray632[0] - 12, arg2 - -Static158.anIntArray632[1] + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method168(@OriginalArg(1) Class44_Sub4_Sub4_Sub1 arg0) {
		@Pc(11) Class6_Sub39 local11 = (Class6_Sub39) Static225.aClass108_26.method2900((long) arg0.anInt5127);
		if (local11 == null) {
			Static152.method3082(arg0.anIntArray560[0], Static343.anInt6225, arg0, 0, arg0.anIntArray561[0], null, null);
		} else {
			local11.method5319();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BII)I")
	public static int method170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static72.anIntArray147[arg1 & 0x3] : 256;
	}
}
