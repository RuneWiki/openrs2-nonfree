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

@OriginalClass("loader!f")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Lloader!unpack;")
	public unpack anUnpack1;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Lloader!unpack;")
	public unpack anUnpack2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/util/Hashtable;")
	public Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/security/ProtectionDomain;")
	private ProtectionDomain aProtectionDomain1;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public ClassLoader_Sub1() {
		@Pc(15) CodeSource local15 = new CodeSource(null, (Certificate[]) null);
		@Pc(19) Permissions local19 = new Permissions();
		local19.add(new AllPermission());
		this.aProtectionDomain1 = new ProtectionDomain(local15, local19);
	}

	@OriginalMember(owner = "loader!f", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable1.get(arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(22) byte[] local22;
		if (this.anUnpack1 != null) {
			local22 = this.anUnpack1.method4876(arg0);
			if (local22 != null) {
				local5 = this.defineClass(arg0, local22, 0, local22.length, this.aProtectionDomain1);
				if (arg1) {
					this.resolveClass(local5);
				}
				this.aHashtable1.put(arg0, local5);
				return local5;
			}
		}
		local22 = this.anUnpack2.method4876(arg0);
		if (local22 == null) {
			return super.findSystemClass(arg0);
		}
		local5 = this.defineClass(arg0, local22, 0, local22.length);
		if (arg1) {
			this.resolveClass(local5);
		}
		this.aHashtable1.put(arg0, local5);
		return local5;
	}
}
