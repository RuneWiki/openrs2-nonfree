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

@OriginalClass("loader!jb")
public final class Class67 implements Runnable {

	@OriginalMember(owner = "loader!jb", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString10;

	@OriginalMember(owner = "loader!jb", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod2;

	@OriginalMember(owner = "loader!jb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "loader!jb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!jb", name = "s", descriptor = "I")
	private static final int anInt2781 = 1;

	@OriginalMember(owner = "loader!jb", name = "c", descriptor = "Lloader!rd;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!jb", name = "g", descriptor = "Lloader!qc;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!jb", name = "f", descriptor = "I")
	private int anInt2780 = 0;

	@OriginalMember(owner = "loader!jb", name = "d", descriptor = "Ljava/lang/String;")
	private String aString12 = null;

	@OriginalMember(owner = "loader!jb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString11 = null;

	@OriginalMember(owner = "loader!jb", name = "r", descriptor = "Lloader!va;")
	private Class69 aClass69_1 = null;

	@OriginalMember(owner = "loader!jb", name = "q", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "loader!jb", name = "v", descriptor = "Lloader!va;")
	private Class69 aClass69_2 = null;

	@OriginalMember(owner = "loader!jb", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!jb", name = "e", descriptor = "Lloader!tb;")
	private Class68 aClass68_1 = null;

	@OriginalMember(owner = "loader!jb", name = "u", descriptor = "Ljava/lang/String;")
	public String aString15 = null;

	@OriginalMember(owner = "loader!jb", name = "t", descriptor = "Ljava/lang/String;")
	private String aString16 = null;

	@OriginalMember(owner = "loader!jb", name = "l", descriptor = "Lloader!tb;")
	private Class68 aClass68_2 = null;

	@OriginalMember(owner = "loader!jb", name = "p", descriptor = "I")
	private int anInt2782 = 0;

	@OriginalMember(owner = "loader!jb", name = "k", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!jb", name = "j", descriptor = "[Lloader!tb;")
	private final Class68[] aClass68Array1;

	@OriginalMember(owner = "loader!jb", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!jb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class67(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString13 = "Unknown";
		aString14 = "1.1";
		this.anApplet2 = arg1;
		this.anInetAddress2 = arg2;
		try {
			aString13 = System.getProperty("java.vendor");
			aString14 = System.getProperty("java.version");
			aString10 = System.getProperty("user.home");
			if (aString10 != null) {
				aString10 = aString10 + "/";
			}
		} catch (@Pc(71) Exception local71) {
		}
		try {
			if (arg1 == null) {
				aMethod2 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod2 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		this.method1920(arg4, arg3);
		this.aClass68_2 = new Class68(new File(this.aString16 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass68Array1 = new Class68[arg5];
		for (@Pc(131) int local131 = 0; local131 < arg5; local131++) {
			this.aClass68Array1[local131] = new Class68(new File(this.aString16 + "main_file_cache.idx" + local131), "rw", 1048576L);
		}
		this.aClass68_1 = new Class68(new File(this.aString16 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1923();
		this.aBoolean131 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!jb", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1920(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (aString10 == null) {
			aString10 = "~/";
		}
		@Pc(24) String local24 = ".file_store_" + arg1;
		@Pc(83) String[] local83 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString10, "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local83.length; local93++) {
			try {
				@Pc(105) String local105 = local83[local93];
				@Pc(115) File local115;
				if (local105.length() > 0) {
					local115 = new File(local105);
					if (!local115.exists()) {
						continue;
					}
				}
				local115 = new File(local105 + local24);
				if (local115.exists() || local115.mkdir()) {
					if (arg0.length() > 0) {
						local115 = new File(local115, arg0);
						if (!local115.exists() && !local115.mkdir()) {
							continue;
						}
					}
					this.aString15 = this.aString12 = local115.getParent() + "/";
					this.aString11 = this.aString16 = local115.getPath() + "/";
					return;
				}
			} catch (@Pc(187) Exception local187) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class69 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean131) {
						return;
					}
					if (this.aClass69_2 != null) {
						local15 = this.aClass69_2;
						this.aClass69_2 = this.aClass69_2.aClass69_3;
						if (this.aClass69_2 == null) {
							this.aClass69_1 = null;
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
				@Pc(43) int local43 = local15.anInt2786;
				if (local43 == 1) {
					local15.anObject7 = new Socket(this.anInetAddress2, local15.anInt2785);
				} else if (local43 == 2) {
					@Pc(70) Thread local70 = new Thread((Runnable) local15.anObject8);
					local70.setDaemon(true);
					local70.start();
					local70.setPriority(local15.anInt2785);
					local15.anObject7 = local70;
				} else if (local43 == 4) {
					local15.anObject7 = new DataInputStream(((URL) local15.anObject8).openStream());
				} else {
					@Pc(103) Object[] local103;
					if (local43 == 9) {
						local103 = (Object[]) local15.anObject8;
						if (((Class) local103[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject7 = ((Class) local103[0]).getDeclaredMethod((String) local103[1], (Class[]) local103[2]);
					} else if (local43 == 10) {
						local103 = (Object[]) local15.anObject8;
						if (((Class) local103[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject7 = ((Class) local103[0]).getDeclaredField((String) local103[1]);
					} else if (local43 == 3) {
						@Pc(166) String local166 = (local15.anInt2785 >> 24 & 0xFF) + "." + (local15.anInt2785 >> 16 & 0xFF) + "." + (local15.anInt2785 >> 8 & 0xFF) + "." + (local15.anInt2785 & 0xFF);
						local15.anObject7 = InetAddress.getByName(local166).getHostName();
					} else if (local43 == 5) {
						local15.anObject7 = new Class68(new File(this.aString12 + "music" + this.anInt2780 + ".mid"), "rw", 1048576L);
						this.anInt2780 = (this.anInt2780 + 1) % 5;
					}
				}
				local15.anInt2787 = 1;
			} catch (@Pc(257) Exception local257) {
				local15.anInt2787 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!jb", name = "b", descriptor = "(I)V")
	private void method1923() {
		try {
			@Pc(12) File local12 = new File(this.aString12 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(43) DataOutputStream local43 = new DataOutputStream(new FileOutputStream(this.aString12 + "uid.dat"));
				local43.writeInt((int) (Math.random() * 9.9999999E7D));
				local43.close();
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			@Pc(69) DataInputStream local69 = new DataInputStream(new FileInputStream(this.aString12 + "uid.dat"));
			this.anInt2782 = local69.readInt() + 1;
			local69.close();
		} catch (@Pc(79) Exception local79) {
		}
	}
}
