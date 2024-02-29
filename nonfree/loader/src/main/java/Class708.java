import java.net.URL;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
final class Class708 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	static int anInt5912;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Lloader!d;")
	static Class707 aClass707_7 = null;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Lloader!d;Lloader!d;I)Lloader!d;", line = 11)
	static final Class707 method36605(@OriginalArg(0) Class707 arg0, @OriginalArg(1) Class707 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) boolean local1 = Class707.aBoolean876;
		anInt5912++;
		((Class707_Sub1_Sub1) arg0).anObject40 = Rs2Applet.method36582(arg0, (byte) -110);
		((Class707_Sub1_Sub1_Sub1) arg0).anObject41 = arg1;
		((Class707_Sub1_Sub1_Sub1_Sub1) arg0).anObject42 = new Hashtable();
		((Class707_Sub1) arg0).anObject39 = new Hashtable();
		@Pc(31) Permissions local31 = new Permissions();
		local31.add(new AllPermission());
		((Class707_Sub1_Sub1_Sub1_Sub1_Sub1) arg0).anObject43 = new ProtectionDomain(new CodeSource(null, (Certificate[]) null), local31);
		if (arg2 != -21387) {
			aClass707_7 = null;
		}
		if (local1) {
			Rs2Applet.aBoolean870 = !Rs2Applet.aBoolean870;
		}
		return arg0;
	}
}
