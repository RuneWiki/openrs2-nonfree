import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!we")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "loader!we", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "loader!we", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!we", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!we", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!we", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!we", name = "l", descriptor = "I")
	private static final int anInt3166 = 1;

	@OriginalMember(owner = "loader!we", name = "a", descriptor = "Lloader!lb;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!we", name = "s", descriptor = "[Lloader!ub;")
	private Class80[] aClass80Array1;

	@OriginalMember(owner = "loader!we", name = "d", descriptor = "Lloader!mc;")
	private Class79 aClass79_3 = null;

	@OriginalMember(owner = "loader!we", name = "h", descriptor = "Lloader!ub;")
	private Class80 aClass80_2 = null;

	@OriginalMember(owner = "loader!we", name = "p", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "loader!we", name = "g", descriptor = "I")
	private int anInt3167 = 0;

	@OriginalMember(owner = "loader!we", name = "m", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!we", name = "f", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!we", name = "o", descriptor = "Lloader!ub;")
	private Class80 aClass80_1 = null;

	@OriginalMember(owner = "loader!we", name = "c", descriptor = "Lloader!mc;")
	private Class79 aClass79_2 = null;

	@OriginalMember(owner = "loader!we", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!we", name = "n", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!we", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!we", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class81(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		aString8 = "Unknown";
		this.anInetAddress2 = arg2;
		aString6 = "1.1";
		this.anApplet3 = arg1;
		try {
			aString8 = System.getProperty("java.vendor");
			aString6 = System.getProperty("java.version");
		} catch (@Pc(46) Exception local46) {
		}
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(63) Exception local63) {
		}
		if (aString7 == null) {
			aString7 = "~/";
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
		} catch (@Pc(124) Exception local124) {
		}
		this.method2197(arg4, arg3, arg5);
		this.aBoolean140 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!we", name = "a", descriptor = "(Ljava/lang/String;IIB)V")
	private void method2197(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString7, "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		@Pc(72) boolean local72 = false;
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local70.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local45.length; local91++) {
					try {
						@Pc(103) String local103 = local45[local91];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local103 + local70[local85]);
						@Pc(140) boolean local140;
						if (local80 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(167) int local167;
						@Pc(151) File local151;
						if (!local72) {
							try {
								local151 = new File(local128, "uid.dat");
								if (local80 == 1 && (!local151.exists() || local151.length() < 4L)) {
									local167 = -1;
									@Pc(171) Random local171 = new Random();
									while (local167 == -1) {
										local167 = local171.nextInt();
									}
									@Pc(188) DataOutputStream local188 = new DataOutputStream(new FileOutputStream(local151));
									local188.writeInt(local167);
									local188.close();
								}
								if (local151.exists()) {
									local72 = true;
									@Pc(207) DataInputStream local207 = new DataInputStream(new FileInputStream(local151));
									this.anInt3167 = local207.readInt() + 1;
									local207.close();
								}
							} catch (@Pc(217) Exception local217) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local128 = new File(local128, arg0);
								if (local80 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local151 = new File(local128, "main_file_cache.dat2");
								if (local80 == 0 && !local151.exists()) {
									continue;
								}
								this.aClass80_2 = new Class80(local151, "rw", 52428800L);
								this.aClass80Array1 = new Class80[16];
								for (local167 = 0; local167 < 16; local167++) {
									this.aClass80Array1[local167] = new Class80(new File(local128, "main_file_cache.idx" + local167), "rw", 1048576L);
								}
								this.aClass80_1 = new Class80(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local128;
							} catch (@Pc(316) Exception local316) {
								try {
									this.aClass80_2.method2194();
									for (local167 = 0; local167 < 16; local167++) {
										this.aClass80Array1[local167].method2194();
									}
									this.aClass80_1.method2194();
								} catch (@Pc(343) Exception local343) {
								}
								this.aClass80_2 = this.aClass80_1 = null;
								this.aClass80Array1 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(360) Exception local360) {
					}
					if (local72 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class79 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean140) {
						return;
					}
					if (this.aClass79_3 != null) {
						local17 = this.aClass79_3;
						this.aClass79_3 = this.aClass79_3.aClass79_1;
						if (this.aClass79_3 == null) {
							this.aClass79_2 = null;
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
				@Pc(47) int local47 = local17.anInt3165;
				if (local47 == 1) {
					local17.anObject6 = new Socket(this.anInetAddress2, local17.anInt3163);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local17.anObject5);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local17.anInt3163);
					local17.anObject6 = local62;
				} else if (local47 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(88) Object[] local88;
					if (local47 == 9) {
						local88 = (Object[]) local17.anObject5;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local88[0]).getDeclaredMethod((String) local88[1], (Class[]) local88[2]);
					} else if (local47 == 10) {
						local88 = (Object[]) local17.anObject5;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local88[0]).getDeclaredField((String) local88[1]);
					} else if (local47 == 3) {
						@Pc(191) String local191 = (local17.anInt3163 >> 24 & 0xFF) + "." + (local17.anInt3163 >> 16 & 0xFF) + "." + (local17.anInt3163 >> 8 & 0xFF) + "." + (local17.anInt3163 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local191).getHostName();
					}
				}
				local17.anInt3164 = 1;
			} catch (@Pc(221) Exception local221) {
				local17.anInt3164 = 2;
			}
		}
	}
}
