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
		@Pc(5) Class local5 = (Class) this.aHashtable1.get(arg0);
		if (local5 != null) {
			return local5;
		}
		try {
			return super.findSystemClass(arg0);
		} catch (@Pc(15) ClassNotFoundException local15) {
			try {
				@Pc(21) byte[] local21 = this.aClass84_1.method2204(arg0);
				local5 = this.defineClass(arg0, local21, 0, local21.length);
				if (arg1) {
					this.resolveClass(local5);
				}
				this.aHashtable1.put(arg0, local5);
				return local5;
			} catch (@Pc(43) Throwable local43) {
				throw new ClassNotFoundException(arg0);
			}
		}
	}
}
