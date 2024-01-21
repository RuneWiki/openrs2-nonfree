import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Lloader!unpack;")
	public Class102 aClass102_1;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/util/Hashtable;")
	public final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "loader!b", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable3.get(arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = this.aClass102_1.method3588(arg0);
		if (local16 == null) {
			return super.findSystemClass(arg0);
		}
		local5 = this.defineClass(arg0, local16, 0, local16.length);
		if (arg1) {
			this.resolveClass(local5);
		}
		this.aHashtable3.put(arg0, local5);
		return local5;
	}
}
