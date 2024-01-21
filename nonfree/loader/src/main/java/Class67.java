import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!qd")
public final class Class67 implements Runnable {

	@OriginalMember(owner = "loader!qd", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!qd", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString12;

	@OriginalMember(owner = "loader!qd", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString13;

	@OriginalMember(owner = "loader!qd", name = "k", descriptor = "I")
	private static final int anInt2834 = 1;

	@OriginalMember(owner = "loader!qd", name = "i", descriptor = "Lloader!fa;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!qd", name = "l", descriptor = "Lloader!r;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!qd", name = "b", descriptor = "Ljava/lang/String;")
	private String aString8 = null;

	@OriginalMember(owner = "loader!qd", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet4 = null;

	@OriginalMember(owner = "loader!qd", name = "r", descriptor = "Lloader!qb;")
	private Class66 aClass66_1 = null;

	@OriginalMember(owner = "loader!qd", name = "c", descriptor = "I")
	private int anInt2835 = 0;

	@OriginalMember(owner = "loader!qd", name = "q", descriptor = "Ljava/lang/String;")
	public String aString9 = null;

	@OriginalMember(owner = "loader!qd", name = "s", descriptor = "Ljava/lang/String;")
	public String aString10 = null;

	@OriginalMember(owner = "loader!qd", name = "f", descriptor = "Lloader!ua;")
	private Class68 aClass68_1 = null;

	@OriginalMember(owner = "loader!qd", name = "g", descriptor = "Lloader!qb;")
	private Class66 aClass66_2 = null;

	@OriginalMember(owner = "loader!qd", name = "h", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "loader!qd", name = "d", descriptor = "Lloader!ua;")
	private Class68 aClass68_2 = null;

	@OriginalMember(owner = "loader!qd", name = "t", descriptor = "I")
	private int anInt2836 = 0;

	@OriginalMember(owner = "loader!qd", name = "v", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "loader!qd", name = "u", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!qd", name = "o", descriptor = "[Lloader!qb;")
	private final Class66[] aClass66Array2;

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "[Lloader!qb;")
	private final Class66[] aClass66Array1;

	@OriginalMember(owner = "loader!qd", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!qd", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class67(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anInetAddress2 = arg2;
		aString12 = "1.1";
		aString13 = "Unknown";
		this.anApplet4 = arg1;
		try {
			aString13 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(82) Exception local82) {
		}
		this.method1830(arg3, arg4);
		@Pc(103) File local103 = new File(this.aString8 + "main_file_cache.dat");
		if (local103.exists()) {
			this.aClass66_2 = new Class66(local103, "rw", 52428800L);
		}
		this.aClass66Array2 = new Class66[5];
		@Pc(121) int local121;
		for (local121 = 0; local121 < 5; local121++) {
			@Pc(141) File local141 = new File(this.aString8 + "main_file_cache.idx" + local121);
			if (local141.exists()) {
				this.aClass66Array2[local121] = new Class66(local141, "rw", 1048576L);
			}
		}
		this.aClass66_1 = new Class66(new File(this.aString11 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass66Array1 = new Class66[arg5];
		for (local121 = 0; local121 < arg5; local121++) {
			this.aClass66Array1[local121] = new Class66(new File(this.aString11 + "main_file_cache.idx" + local121), "rw", 1048576L);
		}
		this.method1829();
		this.aBoolean160 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!qd", name = "e", descriptor = "(I)V")
	private void method1829() {
		try {
			@Pc(19) File local19 = new File(this.aString8 + "uid.dat");
			if (!local19.exists() || local19.length() < 4L) {
				@Pc(45) DataOutputStream local45 = new DataOutputStream(new FileOutputStream(this.aString8 + "uid.dat"));
				local45.writeInt((int) (Math.random() * 9.9999999E7D));
				local45.close();
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			@Pc(71) DataInputStream local71 = new DataInputStream(new FileInputStream(this.aString8 + "uid.dat"));
			this.anInt2835 = local71.readInt() + 1;
			local71.close();
		} catch (@Pc(81) Exception local81) {
		}
	}

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(68) String[] local68 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		@Pc(77) String local77 = ".file_store_" + arg0;
		for (@Pc(79) int local79 = 0; local79 < local68.length; local79++) {
			try {
				@Pc(91) String local91 = local68[local79];
				@Pc(101) File local101;
				if (local91.length() > 0) {
					local101 = new File(local91);
					if (!local101.exists()) {
						continue;
					}
				}
				local101 = new File(local91 + local77);
				if (local101.exists() || local101.mkdir()) {
					if (arg1.length() > 0) {
						local101 = new File(local101, arg1);
						if (!local101.exists() && !local101.mkdir()) {
							continue;
						}
					}
					this.aString10 = this.aString8 = local101.getParent() + "/";
					this.aString9 = this.aString11 = local101.getPath() + "/";
					return;
				}
			} catch (@Pc(177) Exception local177) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!qd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class68 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean160) {
						return;
					}
					if (this.aClass68_2 != null) {
						local15 = this.aClass68_2;
						this.aClass68_2 = this.aClass68_2.aClass68_3;
						if (this.aClass68_2 == null) {
							this.aClass68_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
				}
			}
			try {
				@Pc(43) int local43 = local15.anInt2838;
				if (local43 == 1) {
					local15.anObject8 = new Socket(this.anInetAddress2, local15.anInt2839);
				} else if (local43 == 2) {
					@Pc(237) Thread local237 = new Thread((Runnable) local15.anObject7);
					local237.setDaemon(true);
					local237.start();
					local237.setPriority(local15.anInt2839);
					local15.anObject8 = local237;
				} else if (local43 == 4) {
					local15.anObject8 = new DataInputStream(((URL) local15.anObject7).openStream());
				} else {
					@Pc(173) Object[] local173;
					if (local43 == 9) {
						local173 = (Object[]) local15.anObject7;
						if (((Class) local173[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local173[0]).getDeclaredMethod((String) local173[1], (Class[]) local173[2]);
					} else if (local43 == 10) {
						local173 = (Object[]) local15.anObject7;
						if (((Class) local173[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local173[0]).getDeclaredField((String) local173[1]);
					} else if (local43 == 3) {
						@Pc(124) String local124 = (local15.anInt2839 >> 24 & 0xFF) + "." + (local15.anInt2839 >> 16 & 0xFF) + "." + (local15.anInt2839 >> 8 & 0xFF) + "." + (local15.anInt2839 & 0xFF);
						local15.anObject8 = InetAddress.getByName(local124).getHostName();
					} else if (local43 == 5) {
						local15.anObject8 = new Class66(new File(this.aString8 + "music" + this.anInt2836 + ".mid"), "rw", 1048576L);
						this.anInt2836 = (this.anInt2836 + 1) % 5;
					}
				}
				local15.anInt2837 = 1;
			} catch (@Pc(254) Exception local254) {
				local15.anInt2837 = 2;
			}
		}
	}
}
