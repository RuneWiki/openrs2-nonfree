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

@OriginalClass("loader!cc")
public final class Class67 implements Runnable {

	@OriginalMember(owner = "loader!cc", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!cc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!cc", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "loader!cc", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString14;

	@OriginalMember(owner = "loader!cc", name = "d", descriptor = "I")
	private static final int anInt2956 = 1;

	@OriginalMember(owner = "loader!cc", name = "c", descriptor = "Lloader!rd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!cc", name = "p", descriptor = "Lloader!sc;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!cc", name = "n", descriptor = "Lloader!f;")
	private Class68 aClass68_1 = null;

	@OriginalMember(owner = "loader!cc", name = "l", descriptor = "I")
	private int anInt2954 = 0;

	@OriginalMember(owner = "loader!cc", name = "j", descriptor = "Ljava/lang/String;")
	public String aString16 = null;

	@OriginalMember(owner = "loader!cc", name = "a", descriptor = "Lloader!sa;")
	private Class69 aClass69_2 = null;

	@OriginalMember(owner = "loader!cc", name = "m", descriptor = "Lloader!sa;")
	private Class69 aClass69_1 = null;

	@OriginalMember(owner = "loader!cc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString12 = null;

	@OriginalMember(owner = "loader!cc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "loader!cc", name = "r", descriptor = "I")
	private int anInt2955 = 0;

	@OriginalMember(owner = "loader!cc", name = "s", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "loader!cc", name = "v", descriptor = "Lloader!f;")
	private Class68 aClass68_2 = null;

	@OriginalMember(owner = "loader!cc", name = "u", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!cc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!cc", name = "g", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!cc", name = "i", descriptor = "[Lloader!sa;")
	private final Class69[] aClass69Array1;

	@OriginalMember(owner = "loader!cc", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!cc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class67(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anInetAddress2 = arg2;
		aString10 = "1.1";
		aString13 = "Unknown";
		this.anApplet2 = arg1;
		try {
			aString13 = System.getProperty("java.vendor");
			aString10 = System.getProperty("java.version");
			aString14 = System.getProperty("user.home");
			if (aString14 != null) {
				aString14 = aString14 + "/";
			}
		} catch (@Pc(71) Exception local71) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		this.method2092(arg4, arg3);
		this.aClass69_2 = new Class69(new File(this.aString12 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass69Array1 = new Class69[arg5];
		for (@Pc(131) int local131 = 0; local131 < arg5; local131++) {
			this.aClass69Array1[local131] = new Class69(new File(this.aString12 + "main_file_cache.idx" + local131), "rw", 1048576L);
		}
		this.aClass69_1 = new Class69(new File(this.aString12 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method2096();
		this.aBoolean140 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!cc", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method2092(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (aString14 == null) {
			aString14 = "~/";
		}
		@Pc(31) String local31 = ".file_store_" + arg1;
		@Pc(90) String[] local90 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString14, "/tmp/", "" };
		for (@Pc(92) int local92 = 0; local92 < local90.length; local92++) {
			try {
				@Pc(104) String local104 = local90[local92];
				@Pc(116) File local116;
				if (local104.length() > 0) {
					local116 = new File(local104);
					if (!local116.exists()) {
						continue;
					}
				}
				local116 = new File(local104 + local31);
				if (local116.exists() || local116.mkdir()) {
					if (arg0.length() > 0) {
						local116 = new File(local116, arg0);
						if (!local116.exists() && !local116.mkdir()) {
							continue;
						}
					}
					this.aString16 = this.aString11 = local116.getParent() + "/";
					this.aString15 = this.aString12 = local116.getPath() + "/";
					return;
				}
			} catch (@Pc(192) Exception local192) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!cc", name = "c", descriptor = "(I)V")
	private void method2096() {
		try {
			@Pc(12) File local12 = new File(this.aString11 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(36) DataOutputStream local36 = new DataOutputStream(new FileOutputStream(this.aString11 + "uid.dat"));
				local36.writeInt((int) (Math.random() * 9.9999999E7D));
				local36.close();
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			@Pc(62) DataInputStream local62 = new DataInputStream(new FileInputStream(this.aString11 + "uid.dat"));
			this.anInt2954 = local62.readInt() + 1;
			local62.close();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "loader!cc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class68 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean140) {
						return;
					}
					if (this.aClass68_2 != null) {
						local16 = this.aClass68_2;
						this.aClass68_2 = this.aClass68_2.aClass68_3;
						if (this.aClass68_2 == null) {
							this.aClass68_1 = null;
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
				@Pc(45) int local45 = local16.anInt2959;
				if (local45 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt2957);
				} else if (local45 == 2) {
					@Pc(243) Thread local243 = new Thread((Runnable) local16.anObject5);
					local243.setDaemon(true);
					local243.start();
					local243.setPriority(local16.anInt2957);
					local16.anObject6 = local243;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(169) Object[] local169;
					if (local45 == 9) {
						local169 = (Object[]) local16.anObject5;
						if (((Class) local169[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local169[0]).getDeclaredMethod((String) local169[1], (Class[]) local169[2]);
					} else if (local45 == 10) {
						local169 = (Object[]) local16.anObject5;
						if (((Class) local169[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local169[0]).getDeclaredField((String) local169[1]);
					} else if (local45 == 3) {
						@Pc(120) String local120 = (local16.anInt2957 >> 24 & 0xFF) + "." + (local16.anInt2957 >> 16 & 0xFF) + "." + (local16.anInt2957 >> 8 & 0xFF) + "." + (local16.anInt2957 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local120).getHostName();
					} else if (local45 == 5) {
						local16.anObject6 = new Class69(new File(this.aString11 + "music" + this.anInt2955 + ".mid"), "rw", 1048576L);
						this.anInt2955 = (this.anInt2955 + 1) % 5;
					}
				}
				local16.anInt2958 = 1;
			} catch (@Pc(260) Exception local260) {
				local16.anInt2958 = 2;
			}
		}
	}
}
