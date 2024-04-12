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

@OriginalClass("loader!bb")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "loader!bb", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!bb", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!bb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "loader!bb", name = "a", descriptor = "I")
	private static final int anInt2609 = 1;

	@OriginalMember(owner = "loader!bb", name = "l", descriptor = "Lloader!id;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!bb", name = "p", descriptor = "Lloader!c;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!bb", name = "b", descriptor = "I")
	private int anInt2608 = 0;

	@OriginalMember(owner = "loader!bb", name = "j", descriptor = "Ljava/lang/String;")
	private String aString9 = null;

	@OriginalMember(owner = "loader!bb", name = "r", descriptor = "Lloader!dc;")
	private Class67 aClass67_1 = null;

	@OriginalMember(owner = "loader!bb", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!bb", name = "e", descriptor = "Ljava/lang/String;")
	public String aString11 = null;

	@OriginalMember(owner = "loader!bb", name = "u", descriptor = "Ljava/lang/String;")
	public String aString13 = null;

	@OriginalMember(owner = "loader!bb", name = "q", descriptor = "Lloader!dc;")
	private Class67 aClass67_2 = null;

	@OriginalMember(owner = "loader!bb", name = "m", descriptor = "Ljava/lang/String;")
	private String aString14 = null;

	@OriginalMember(owner = "loader!bb", name = "g", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "loader!bb", name = "t", descriptor = "Lloader!dc;")
	private Class67 aClass67_3 = null;

	@OriginalMember(owner = "loader!bb", name = "s", descriptor = "Lloader!qd;")
	private Class68 aClass68_1 = null;

	@OriginalMember(owner = "loader!bb", name = "w", descriptor = "Lloader!qd;")
	private Class68 aClass68_2 = null;

	@OriginalMember(owner = "loader!bb", name = "n", descriptor = "I")
	private int anInt2610 = 0;

	@OriginalMember(owner = "loader!bb", name = "f", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!bb", name = "d", descriptor = "[Lloader!dc;")
	private final Class67[] aClass67Array1;

	@OriginalMember(owner = "loader!bb", name = "i", descriptor = "[Lloader!dc;")
	private final Class67[] aClass67Array2;

	@OriginalMember(owner = "loader!bb", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!bb", name = "c", descriptor = "(B)V", line = 148)
	private void method1756() {
		try {
			@Pc(12) File local12 = new File(this.aString9 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString9 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			@Pc(70) DataInputStream local70 = new DataInputStream(new FileInputStream(this.aString9 + "uid.dat"));
			this.anInt2610 = local70.readInt() + 1;
			local70.close();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "loader!bb", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 234)
	private void method1760(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(17) String local17 = ".file_store_" + arg1;
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			try {
				@Pc(102) String local102 = local88[local90];
				@Pc(111) File local111;
				if (local102.length() > 0) {
					local111 = new File(local102);
					if (!local111.exists()) {
						continue;
					}
				}
				local111 = new File(local102 + local17);
				if (local111.exists() || local111.mkdir()) {
					if (arg0.length() > 0) {
						local111 = new File(local111, arg0);
						if (!local111.exists() && !local111.mkdir()) {
							continue;
						}
					}
					this.aString13 = this.aString9 = local111.getParent() + "/";
					this.aString11 = this.aString14 = local111.getPath() + "/";
					return;
				}
			} catch (@Pc(186) Exception local186) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!bb", name = "run", descriptor = "()V", line = 356)
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class68 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean187) {
						return;
					}
					if (this.aClass68_1 != null) {
						local16 = this.aClass68_1;
						this.aClass68_1 = this.aClass68_1.aClass68_3;
						if (this.aClass68_1 == null) {
							this.aClass68_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt2615;
				if (local46 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt2613);
				} else if (local46 == 2) {
					@Pc(238) Thread local238 = new Thread((Runnable) local16.anObject7);
					local238.setDaemon(true);
					local238.start();
					local238.setPriority(local16.anInt2613);
					local16.anObject6 = local238;
				} else if (local46 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject7).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local46 == 9) {
						local92 = (Object[]) local16.anObject7;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local46 == 10) {
						local92 = (Object[]) local16.anObject7;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local46 == 3) {
						@Pc(192) String local192 = (local16.anInt2613 >> 24 & 0xFF) + "." + (local16.anInt2613 >> 16 & 0xFF) + "." + (local16.anInt2613 >> 8 & 0xFF) + "." + (local16.anInt2613 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local192).getHostName();
					} else if (local46 == 5) {
						local16.anObject6 = new Class67(new File(this.aString9 + "music" + this.anInt2608 + ".mid"), "rw", 1048576L);
						this.anInt2608 = (this.anInt2608 + 1) % 5;
					}
				}
				local16.anInt2614 = 1;
			} catch (@Pc(255) Exception local255) {
				local16.anInt2614 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!bb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 512)
	public Class66(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString12 = "1.1";
		this.anApplet3 = arg1;
		aString10 = "Unknown";
		this.anInetAddress2 = arg2;
		try {
			aString10 = System.getProperty("java.vendor");
			aString12 = System.getProperty("java.version");
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(85) Exception local85) {
		}
		this.method1760(arg4, arg3);
		@Pc(106) File local106 = new File(this.aString9 + "main_file_cache.dat");
		if (local106.exists()) {
			this.aClass67_1 = new Class67(local106, "rw", 52428800L);
		}
		this.aClass67Array1 = new Class67[5];
		@Pc(124) int local124;
		for (local124 = 0; local124 < 5; local124++) {
			@Pc(142) File local142 = new File(this.aString9 + "main_file_cache.idx" + local124);
			if (local142.exists()) {
				this.aClass67Array1[local124] = new Class67(local142, "rw", 1048576L);
			}
		}
		this.aClass67_2 = new Class67(new File(this.aString14 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass67Array2 = new Class67[arg5];
		for (local124 = 0; local124 < arg5; local124++) {
			this.aClass67Array2[local124] = new Class67(new File(this.aString14 + "main_file_cache.idx" + local124), "rw", 1048576L);
		}
		this.aClass67_3 = new Class67(new File(this.aString14 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1756();
		this.aBoolean187 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}
}
