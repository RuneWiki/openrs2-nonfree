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

@OriginalClass("loader!lc")
public final class Class71 implements Runnable {

	@OriginalMember(owner = "loader!lc", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!lc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString11;

	@OriginalMember(owner = "loader!lc", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "loader!lc", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString14;

	@OriginalMember(owner = "loader!lc", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!lc", name = "r", descriptor = "I")
	private static final int anInt2824 = 1;

	@OriginalMember(owner = "loader!lc", name = "k", descriptor = "Lloader!le;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!lc", name = "w", descriptor = "Lloader!db;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!lc", name = "o", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "loader!lc", name = "q", descriptor = "Lloader!q;")
	private Class72 aClass72_1 = null;

	@OriginalMember(owner = "loader!lc", name = "c", descriptor = "I")
	private int anInt2826 = 0;

	@OriginalMember(owner = "loader!lc", name = "l", descriptor = "Lloader!ed;")
	private Class70 aClass70_2 = null;

	@OriginalMember(owner = "loader!lc", name = "i", descriptor = "Lloader!q;")
	private Class72 aClass72_2 = null;

	@OriginalMember(owner = "loader!lc", name = "b", descriptor = "I")
	private int anInt2825 = 0;

	@OriginalMember(owner = "loader!lc", name = "g", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "loader!lc", name = "u", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!lc", name = "n", descriptor = "Ljava/lang/String;")
	private String aString13 = null;

	@OriginalMember(owner = "loader!lc", name = "a", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!lc", name = "v", descriptor = "Ljava/lang/String;")
	public String aString16 = null;

	@OriginalMember(owner = "loader!lc", name = "m", descriptor = "Lloader!ed;")
	private Class70 aClass70_3 = null;

	@OriginalMember(owner = "loader!lc", name = "h", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!lc", name = "d", descriptor = "[Lloader!q;")
	private final Class72[] aClass72Array1;

	@OriginalMember(owner = "loader!lc", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!lc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class71(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anApplet2 = arg1;
		aString12 = "1.1";
		aString11 = "Unknown";
		this.anInetAddress2 = arg2;
		try {
			aString11 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
			aString14 = System.getProperty("user.home");
			if (aString14 != null) {
				aString14 = aString14 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		this.method1841(arg3, arg4);
		this.aClass72_1 = new Class72(new File(this.aString10 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass72Array1 = new Class72[arg5];
		for (@Pc(156) int local156 = 0; local156 < arg5; local156++) {
			this.aClass72Array1[local156] = new Class72(new File(this.aString10 + "main_file_cache.idx" + local156), "rw", 1048576L);
		}
		this.aClass72_2 = new Class72(new File(this.aString10 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1838();
		this.aBoolean164 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!lc", name = "a", descriptor = "(Z)V")
	private void method1838() {
		try {
			@Pc(12) File local12 = new File(this.aString13 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString13 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			@Pc(67) DataInputStream local67 = new DataInputStream(new FileInputStream(this.aString13 + "uid.dat"));
			this.anInt2826 = local67.readInt() + 1;
			local67.close();
		} catch (@Pc(77) Exception local77) {
		}
	}

	@OriginalMember(owner = "loader!lc", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method1841(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (aString14 == null) {
			aString14 = "~/";
		}
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(82) String[] local82 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString14, "/tmp/", "" };
		@Pc(91) String local91 = ".file_store_" + arg0;
		for (@Pc(93) int local93 = 0; local93 < local82.length; local93++) {
			try {
				@Pc(101) String local101 = local82[local93];
				@Pc(112) File local112;
				if (local101.length() > 0) {
					local112 = new File(local101);
					if (!local112.exists()) {
						continue;
					}
				}
				local112 = new File(local101 + local91);
				if (local112.exists() || local112.mkdir()) {
					if (arg1.length() > 0) {
						local112 = new File(local112, arg1);
						if (!local112.exists() && !local112.mkdir()) {
							continue;
						}
					}
					this.aString16 = this.aString13 = local112.getParent() + "/";
					this.aString15 = this.aString10 = local112.getPath() + "/";
					return;
				}
			} catch (@Pc(183) Exception local183) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class70 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean164) {
						return;
					}
					if (this.aClass70_3 != null) {
						local16 = this.aClass70_3;
						this.aClass70_3 = this.aClass70_3.aClass70_1;
						if (this.aClass70_3 == null) {
							this.aClass70_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt2822;
				if (local45 == 1) {
					local16.anObject5 = new Socket(this.anInetAddress2, local16.anInt2821);
				} else if (local45 == 2) {
					@Pc(239) Thread local239 = new Thread((Runnable) local16.anObject6);
					local239.setDaemon(true);
					local239.start();
					local239.setPriority(local16.anInt2821);
					local16.anObject5 = local239;
				} else if (local45 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(81) Object[] local81;
					if (local45 == 9) {
						local81 = (Object[]) local16.anObject6;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local81[0]).getDeclaredMethod((String) local81[1], (Class[]) local81[2]);
					} else if (local45 == 10) {
						local81 = (Object[]) local16.anObject6;
						if (((Class) local81[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local81[0]).getDeclaredField((String) local81[1]);
					} else if (local45 == 3) {
						@Pc(145) String local145 = (local16.anInt2821 >> 24 & 0xFF) + "." + (local16.anInt2821 >> 16 & 0xFF) + "." + (local16.anInt2821 >> 8 & 0xFF) + "." + (local16.anInt2821 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local145).getHostName();
					} else if (local45 == 5) {
						local16.anObject5 = new Class72(new File(this.aString13 + "music" + this.anInt2825 + ".mid"), "rw", 1048576L);
						this.anInt2825 = (this.anInt2825 + 1) % 5;
					}
				}
				local16.anInt2823 = 1;
			} catch (@Pc(256) Exception local256) {
				local16.anInt2823 = 2;
			}
		}
	}
}
