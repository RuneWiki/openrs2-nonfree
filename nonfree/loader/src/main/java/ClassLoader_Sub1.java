import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Lloader!unpack;")
	public Class84 aClass84_1;

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
		} catch (@Pc(17) ClassNotFoundException local17) {
			try {
				@Pc(23) byte[] local23 = this.aClass84_1.method2120(arg0);
				local7 = this.defineClass(arg0, local23, 0, local23.length);
				if (arg1) {
					this.resolveClass(local7);
				}
				this.aHashtable1.put(arg0, local7);
				return local7;
			} catch (@Pc(50) Throwable local50) {
				throw new ClassNotFoundException(arg0);
			}
		}
	}
}
