import java.io.IOException;
import java.io.InputStream;
import java.security.ProtectionDomain;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	static int anInt5606;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	static int anInt5607;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	static String aString249;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	static int anInt5608;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "Lloader!j;")
	static Class636 aClass636_4;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Lloader!j;")
	private Class636 aClass636_3;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 5)
	private final Class method33907(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws ClassNotFoundException {
		if (arg1 != 18981) {
			aString249 = null;
		}
		anInt5606++;
		return super.findSystemClass(arg0);
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Lloader!j;)V", line = 15)
	ClassLoader_Sub1(@OriginalArg(0) Class636 arg0) {
		this.aClass636_3 = arg0;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/security/ProtectionDomain;ZILjava/lang/String;I[B)Ljava/lang/Class;", line = 26)
	private final Class method33908(@OriginalArg(0) ProtectionDomain arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) throws ClassFormatError {
		anInt5607++;
		if (arg1) {
			this.aClass636_3 = null;
		}
		return this.defineClass(arg3, arg5, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "loader!b", name = "findClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 37)
	@Override
	protected final Class findClass(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		anInt5608++;
		@Pc(8) Class636 local8 = this.aClass636_3;
		@Pc(16) Class local16 = (Class) ((Hashtable) ((Class636_Sub1_Sub1_Sub1_Sub1_Sub1) local8).anObject44).get(arg0);
		@Pc(20) Class local20;
		if (local16 == null) {
			@Pc(40) byte[] local40 = (byte[]) ((Hashtable) ((Class636_Sub1_Sub1_Sub1) local8).anObject42).get(arg0);
			if (local40 == null) {
				@Pc(67) String local67 = arg0.replace('.', '/') + ".class";
				@Pc(74) InputStream local74 = ((ClassLoader) ((Class636_Sub1) local8).anObject40).getResourceAsStream(local67);
				if (local74 == null) {
					local20 = ((ClassLoader_Sub1) ((Class636_Sub1) local8).anObject40).method33907(arg0, 18981);
					return local20;
				}
				@Pc(92) byte[] local92 = new byte[5242880];
				@Pc(94) int local94 = 0;
				try {
					for (@Pc(103) int local103 = local74.read(local92, local94, -local94 + 5242880); local103 != -1; local103 = local74.read(local92, local94, -local94 + 5242880)) {
						local94 += local103;
					}
				} catch (@Pc(128) IOException local128) {
				}
				@Pc(131) byte[] local131 = new byte[local94];
				System.arraycopy(local92, 0, local131, 0, local94);
				try {
					local40 = Class636.method33920((Class636) ((Class636_Sub1_Sub1) local8).anObject41, -1453, local131);
				} catch (@Pc(147) Exception local147) {
					throw new RuntimeException(local147);
				}
			} else {
				((Hashtable) ((Class636_Sub1_Sub1_Sub1) local8).anObject42).remove(arg0);
			}
			if (local40 == null) {
				local20 = ((ClassLoader_Sub1) ((Class636_Sub1) local8).anObject40).method33907(arg0, 18981);
			} else {
				@Pc(170) Class local170 = ((ClassLoader_Sub1) ((Class636_Sub1) local8).anObject40).method33908((ProtectionDomain) ((Class636_Sub1_Sub1_Sub1_Sub1) local8).anObject43, false, 0, arg0, local40.length, local40);
				local20 = local170;
				((Hashtable) ((Class636_Sub1_Sub1_Sub1_Sub1_Sub1) local8).anObject44).put(arg0, local170);
			}
		} else {
			local20 = local16;
		}
		return local20;
	}

	static {
		@Pc(49) Class636_Sub1 local49 = new Class636_Sub1(15);
		((Class636_Sub1) local49).anObject40 = "clibs";
		aClass636_4 = local49;
	}
}
