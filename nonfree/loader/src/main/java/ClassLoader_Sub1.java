import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Lloader!unpack;")
	public unpack anUnpack1;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/util/Hashtable;")
	public Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "loader!c", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable1.get(arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(17) byte[] local17 = this.anUnpack1.method3756(arg0);
		if (local17 == null) {
			return super.findSystemClass(arg0);
		}
		local5 = this.defineClass(arg0, local17, 0, local17.length);
		if (arg1) {
			this.resolveClass(local5);
		}
		this.aHashtable1.put(arg0, local5);
		return local5;
	}
}
