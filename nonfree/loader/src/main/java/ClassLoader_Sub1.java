import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Lloader!unpack;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/util/Hashtable;")
	public final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "loader!b", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	protected synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable1.get(arg0);
		if (local5 != null) {
			return local5;
		}
		try {
			return super.findSystemClass(arg0);
		} catch (@Pc(16) ClassNotFoundException local16) {
			try {
				@Pc(22) byte[] local22 = this.aClass90_1.method3027(arg0);
				local5 = this.defineClass(arg0, local22, 0, local22.length);
				if (arg1) {
					this.resolveClass(local5);
				}
				this.aHashtable1.put(arg0, local5);
				return local5;
			} catch (@Pc(44) Throwable local44) {
				throw new ClassNotFoundException(arg0);
			}
		}
	}
}
