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

@OriginalClass("loader!jc")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "loader!jc", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!jc", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString12;

	@OriginalMember(owner = "loader!jc", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!jc", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!jc", name = "q", descriptor = "I")
	private static final int anInt2863 = 1;

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "Lloader!cd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!jc", name = "n", descriptor = "Lloader!gb;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!jc", name = "b", descriptor = "Lloader!be;")
	private Class66 aClass66_1 = null;

	@OriginalMember(owner = "loader!jc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "loader!jc", name = "f", descriptor = "Ljava/lang/String;")
	public String aString13 = null;

	@OriginalMember(owner = "loader!jc", name = "j", descriptor = "I")
	private int anInt2862 = 0;

	@OriginalMember(owner = "loader!jc", name = "m", descriptor = "Ljava/lang/String;")
	private String aString16 = null;

	@OriginalMember(owner = "loader!jc", name = "l", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!jc", name = "r", descriptor = "I")
	private int anInt2864 = 0;

	@OriginalMember(owner = "loader!jc", name = "d", descriptor = "Lloader!be;")
	private Class66 aClass66_2 = null;

	@OriginalMember(owner = "loader!jc", name = "o", descriptor = "Lloader!qb;")
	private Class69 aClass69_2 = null;

	@OriginalMember(owner = "loader!jc", name = "s", descriptor = "Lloader!qb;")
	private Class69 aClass69_1 = null;

	@OriginalMember(owner = "loader!jc", name = "v", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "loader!jc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!jc", name = "i", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!jc", name = "p", descriptor = "[Lloader!be;")
	private final Class66[] aClass66Array1;

	@OriginalMember(owner = "loader!jc", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!jc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class68(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString14 = "1.1";
		this.anApplet2 = arg1;
		this.anInetAddress2 = arg2;
		aString10 = "Unknown";
		try {
			aString10 = System.getProperty("java.vendor");
			aString14 = System.getProperty("java.version");
			aString12 = System.getProperty("user.home");
			if (aString12 != null) {
				aString12 = aString12 + "/";
			}
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		this.method1910(arg3, arg4);
		this.aClass66_2 = new Class66(new File(this.aString16 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass66Array1 = new Class66[arg5];
		for (@Pc(130) int local130 = 0; local130 < arg5; local130++) {
			this.aClass66Array1[local130] = new Class66(new File(this.aString16 + "main_file_cache.idx" + local130), "rw", 1048576L);
		}
		this.aClass66_1 = new Class66(new File(this.aString16 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1904();
		this.aBoolean175 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "(B)V")
	private void method1904() {
		try {
			@Pc(12) File local12 = new File(this.aString11 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(43) DataOutputStream local43 = new DataOutputStream(new FileOutputStream(this.aString11 + "uid.dat"));
				local43.writeInt((int) (Math.random() * 9.9999999E7D));
				local43.close();
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			@Pc(69) DataInputStream local69 = new DataInputStream(new FileInputStream(this.aString11 + "uid.dat"));
			this.anInt2864 = local69.readInt() + 1;
			local69.close();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "loader!jc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class69 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean175) {
						return;
					}
					if (this.aClass69_2 != null) {
						local17 = this.aClass69_2;
						this.aClass69_2 = this.aClass69_2.aClass69_3;
						if (this.aClass69_2 == null) {
							this.aClass69_1 = null;
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
				@Pc(45) int local45 = local17.anInt2868;
				if (local45 == 1) {
					local17.anObject6 = new Socket(this.anInetAddress2, local17.anInt2869);
				} else if (local45 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local17.anObject5);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local17.anInt2869);
					local17.anObject6 = local60;
				} else if (local45 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local45 == 9) {
						local86 = (Object[]) local17.anObject5;
						if (((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local45 == 10) {
						local86 = (Object[]) local17.anObject5;
						if (((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local45 == 3) {
						@Pc(187) String local187 = (local17.anInt2869 >> 24 & 0xFF) + "." + (local17.anInt2869 >> 16 & 0xFF) + "." + (local17.anInt2869 >> 8 & 0xFF) + "." + (local17.anInt2869 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local187).getHostName();
					} else if (local45 == 5) {
						local17.anObject6 = new Class66(new File(this.aString11 + "music" + this.anInt2862 + ".mid"), "rw", 1048576L);
						this.anInt2862 = (this.anInt2862 + 1) % 5;
					}
				}
				local17.anInt2867 = 1;
			} catch (@Pc(253) Exception local253) {
				local17.anInt2867 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!jc", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method1910(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		if (aString12 == null) {
			aString12 = "~/";
		}
		@Pc(26) String local26 = ".file_store_" + arg0;
		@Pc(85) String[] local85 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString12, "/tmp/", "" };
		for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
			try {
				@Pc(95) String local95 = local85[local87];
				@Pc(107) File local107;
				if (local95.length() > 0) {
					local107 = new File(local95);
					if (!local107.exists()) {
						continue;
					}
				}
				local107 = new File(local95 + local26);
				if (local107.exists() || local107.mkdir()) {
					if (arg1.length() > 0) {
						local107 = new File(local107, arg1);
						if (!local107.exists() && !local107.mkdir()) {
							continue;
						}
					}
					this.aString13 = this.aString11 = local107.getParent() + "/";
					this.aString15 = this.aString16 = local107.getPath() + "/";
					return;
				}
			} catch (@Pc(181) Exception local181) {
			}
		}
		throw new RuntimeException();
	}
}
