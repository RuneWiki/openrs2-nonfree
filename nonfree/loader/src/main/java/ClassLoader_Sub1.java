import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Lloader!unpack;")
	public Class79 aClass79_1;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/util/Hashtable;")
	public final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "loader!a", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(7) Class local7 = (Class) this.aHashtable1.get(arg0);
		if (local7 != null) {
			return local7;
		}
		try {
			return super.findSystemClass(arg0);
		} catch (@Pc(16) ClassNotFoundException local16) {
			try {
				@Pc(22) byte[] local22 = this.aClass79_1.method2188(arg0);
				local7 = this.defineClass(arg0, local22, 0, local22.length);
				if (arg1) {
					this.resolveClass(local7);
				}
				this.aHashtable1.put(arg0, local7);
				return local7;
			} catch (@Pc(49) Throwable local49) {
				throw new ClassNotFoundException(arg0);
			}
		}
	}
}
