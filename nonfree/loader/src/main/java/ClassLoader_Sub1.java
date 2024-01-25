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

@OriginalClass("loader!c")
public final class ClassLoader_Sub1 extends ClassLoader implements Interface13 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Lloader!unpack;")
	private final unpack anUnpack1;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/security/ProtectionDomain;")
	private final ProtectionDomain aProtectionDomain1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Lloader!unpack;)V")
	public ClassLoader_Sub1(@OriginalArg(0) unpack arg0) {
		this.anUnpack1 = arg0;
		@Pc(18) CodeSource local18 = new CodeSource(null, (Certificate[]) null);
		@Pc(22) Permissions local22 = new Permissions();
		local22.add(new AllPermission());
		this.aProtectionDomain1 = new ProtectionDomain(local18, local22);
	}

	@OriginalMember(owner = "loader!c", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	public synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable3.get(arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = this.anUnpack1.method6024(arg0);
		if (local15 == null) {
			return super.findSystemClass(arg0);
		}
		local5 = this.defineClass(arg0, local15, 0, local15.length, this.aProtectionDomain1);
		if (arg1) {
			this.resolveClass(local5);
		}
		this.aHashtable3.put(arg0, local5);
		return local5;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)V")
	@Override
	public void method6027(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		this.aHashtable3.put(arg1, arg0);
	}
}
