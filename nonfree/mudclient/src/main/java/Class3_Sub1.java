import a.a.Class3;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!d")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "mudclient!d", name = "L", descriptor = "Lmudclient!mudclient;")
	public mudclient aMudclient1;

	@OriginalMember(owner = "mudclient!d", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		super(arg0, arg1, arg2, arg3);
		@Pc(7) boolean local7 = false;
		if (local7) {
			new Class3(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "mudclient!d", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 >= 50000) {
			this.aMudclient1.method533(arg0, arg1, arg2, arg3, arg4 - 50000, arg5, arg6);
		} else if (arg4 >= 40000) {
			this.aMudclient1.method534(arg0, arg1, arg2, arg3, arg4 - 40000, arg5, arg6);
		} else if (arg4 >= 20000) {
			this.aMudclient1.method535(arg0, arg1, arg2, arg3, arg4 - 20000, arg5, arg6);
		} else if (arg4 >= 5000) {
			this.aMudclient1.method536(arg0, arg1, arg2, arg3, arg4 - 5000, arg5, arg6);
		} else {
			super.method384(arg0, arg1, arg2, arg3, arg4);
		}
	}
}
