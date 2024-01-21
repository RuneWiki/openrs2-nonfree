import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Lloader!unpack;")
	public Class69 aClass69_1;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/util/Hashtable;")
	public final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "loader!b", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
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
				@Pc(23) byte[] local23 = this.aClass69_1.method1828(arg0);
				local7 = this.defineClass(arg0, local23, 0, local23.length);
				if (arg1) {
					this.resolveClass(local7);
				}
				this.aHashtable1.put(arg0, local7);
				return local7;
			} catch (@Pc(53) Throwable local53) {
				throw new ClassNotFoundException(arg0);
			}
		}
	}
}
