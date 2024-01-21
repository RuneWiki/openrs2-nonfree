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

@OriginalClass("loader!ed")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "loader!ed", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!ed", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "loader!ed", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString15;

	@OriginalMember(owner = "loader!ed", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ed", name = "r", descriptor = "I")
	private static final int anInt3009 = 1;

	@OriginalMember(owner = "loader!ed", name = "h", descriptor = "Lloader!nd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!ed", name = "u", descriptor = "Lloader!uc;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!ed", name = "c", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "loader!ed", name = "p", descriptor = "Lloader!be;")
	private Class70 aClass70_1 = null;

	@OriginalMember(owner = "loader!ed", name = "f", descriptor = "Ljava/lang/String;")
	private String aString13 = null;

	@OriginalMember(owner = "loader!ed", name = "g", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "loader!ed", name = "b", descriptor = "Lloader!sc;")
	private Class73 aClass73_1 = null;

	@OriginalMember(owner = "loader!ed", name = "m", descriptor = "I")
	private int anInt3010 = 0;

	@OriginalMember(owner = "loader!ed", name = "o", descriptor = "I")
	private int anInt3011 = 0;

	@OriginalMember(owner = "loader!ed", name = "w", descriptor = "Lloader!sc;")
	private Class73 aClass73_2 = null;

	@OriginalMember(owner = "loader!ed", name = "s", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ed", name = "e", descriptor = "Ljava/lang/String;")
	public String aString16 = null;

	@OriginalMember(owner = "loader!ed", name = "n", descriptor = "Lloader!be;")
	private Class70 aClass70_2 = null;

	@OriginalMember(owner = "loader!ed", name = "k", descriptor = "Ljava/lang/String;")
	private String aString12 = null;

	@OriginalMember(owner = "loader!ed", name = "q", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!ed", name = "v", descriptor = "[Lloader!be;")
	private final Class70[] aClass70Array1;

	@OriginalMember(owner = "loader!ed", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ed", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class72(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		aString10 = "1.1";
		this.anApplet2 = arg1;
		aString14 = "Unknown";
		this.anInetAddress2 = arg2;
		try {
			aString14 = System.getProperty("java.vendor");
			aString10 = System.getProperty("java.version");
			aString15 = System.getProperty("user.home");
			if (aString15 != null) {
				aString15 = aString15 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		this.method1997(arg4, arg3);
		this.aClass70_1 = new Class70(new File(this.aString13 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass70Array1 = new Class70[arg5];
		for (@Pc(156) int local156 = 0; local156 < arg5; local156++) {
			this.aClass70Array1[local156] = new Class70(new File(this.aString13 + "main_file_cache.idx" + local156), "rw", 1048576L);
		}
		this.aClass70_2 = new Class70(new File(this.aString13 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method1990();
		this.aBoolean163 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ed", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class73 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean163) {
						return;
					}
					if (this.aClass73_1 != null) {
						local18 = this.aClass73_1;
						this.aClass73_1 = this.aClass73_1.aClass73_3;
						if (this.aClass73_1 == null) {
							this.aClass73_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local18.anInt3016;
				if (local47 == 1) {
					local18.anObject5 = new Socket(this.anInetAddress2, local18.anInt3015);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local18.anObject6);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local18.anInt3015);
					local18.anObject5 = local62;
				} else if (local47 == 4) {
					local18.anObject5 = new DataInputStream(((URL) local18.anObject6).openStream());
				} else {
					@Pc(86) Object[] local86;
					if (local47 == 9) {
						local86 = (Object[]) local18.anObject6;
						if (((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject5 = ((Class) local86[0]).getDeclaredMethod((String) local86[1], (Class[]) local86[2]);
					} else if (local47 == 10) {
						local86 = (Object[]) local18.anObject6;
						if (((Class) local86[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject5 = ((Class) local86[0]).getDeclaredField((String) local86[1]);
					} else if (local47 == 3) {
						@Pc(199) String local199 = (local18.anInt3015 >> 24 & 0xFF) + "." + (local18.anInt3015 >> 16 & 0xFF) + "." + (local18.anInt3015 >> 8 & 0xFF) + "." + (local18.anInt3015 & 0xFF);
						local18.anObject5 = InetAddress.getByName(local199).getHostName();
					} else if (local47 == 5) {
						local18.anObject5 = new Class70(new File(this.aString11 + "music" + this.anInt3011 + ".mid"), "rw", 1048576L);
						this.anInt3011 = (this.anInt3011 + 1) % 5;
					}
				}
				local18.anInt3014 = 1;
			} catch (@Pc(256) Exception local256) {
				local18.anInt3014 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ed", name = "d", descriptor = "(B)V")
	private void method1990() {
		try {
			@Pc(12) File local12 = new File(this.aString11 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(39) DataOutputStream local39 = new DataOutputStream(new FileOutputStream(this.aString11 + "uid.dat"));
				local39.writeInt((int) (Math.random() * 9.9999999E7D));
				local39.close();
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			@Pc(65) DataInputStream local65 = new DataInputStream(new FileInputStream(this.aString11 + "uid.dat"));
			this.anInt3010 = local65.readInt() + 1;
			local65.close();
		} catch (@Pc(82) Exception local82) {
		}
	}

	@OriginalMember(owner = "loader!ed", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private void method1997(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (aString15 == null) {
			aString15 = "~/";
		}
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(72) String[] local72 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString15, "/tmp/", "" };
		@Pc(81) String local81 = ".file_store_" + arg1;
		for (@Pc(89) int local89 = 0; local89 < local72.length; local89++) {
			try {
				@Pc(97) String local97 = local72[local89];
				@Pc(105) File local105;
				if (local97.length() > 0) {
					local105 = new File(local97);
					if (!local105.exists()) {
						continue;
					}
				}
				local105 = new File(local97 + local81);
				if (local105.exists() || local105.mkdir()) {
					if (arg0.length() > 0) {
						local105 = new File(local105, arg0);
						if (!local105.exists() && !local105.mkdir()) {
							continue;
						}
					}
					this.aString12 = this.aString11 = local105.getParent() + "/";
					this.aString16 = this.aString13 = local105.getPath() + "/";
					return;
				}
			} catch (@Pc(178) Exception local178) {
			}
		}
		throw new RuntimeException();
	}
}
