import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
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

@OriginalClass("loader!tc")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "loader!tc", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!tc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!tc", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!tc", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!tc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!tc", name = "j", descriptor = "I")
	private static final int anInt2969 = 1;

	@OriginalMember(owner = "loader!tc", name = "r", descriptor = "Lloader!gf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!tc", name = "s", descriptor = "[Lloader!bc;")
	private Class82[] aClass82Array1;

	@OriginalMember(owner = "loader!tc", name = "d", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!tc", name = "c", descriptor = "Lloader!bc;")
	private Class82 aClass82_1 = null;

	@OriginalMember(owner = "loader!tc", name = "e", descriptor = "Lloader!le;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!tc", name = "m", descriptor = "Lloader!le;")
	private Class84 aClass84_3 = null;

	@OriginalMember(owner = "loader!tc", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!tc", name = "o", descriptor = "Lloader!bc;")
	private Class82 aClass82_2 = null;

	@OriginalMember(owner = "loader!tc", name = "p", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!tc", name = "l", descriptor = "I")
	private int anInt2970 = 0;

	@OriginalMember(owner = "loader!tc", name = "n", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "loader!tc", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!tc", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!tc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class85(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "1.1";
		aString9 = "Unknown";
		this.anApplet3 = arg1;
		try {
			aString9 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(61) Exception local61) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(100) Exception local100) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method2076(arg3, arg4, arg2);
		this.aBoolean135 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!tc", name = "a", descriptor = "(Ljava/lang/String;BII)V")
	private void method2076(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString8, "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(76) boolean local76 = false;
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local74.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local49.length; local95++) {
					try {
						@Pc(103) String local103 = local49[local95];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(130) File local130 = new File(local103 + local74[local85]);
						@Pc(141) boolean local141;
						if (local78 == 1 && !local130.exists()) {
							local141 = local130.mkdir();
							if (!local141) {
								continue;
							}
						}
						@Pc(167) int local167;
						@Pc(153) File local153;
						if (!local76) {
							try {
								local153 = new File(local130, "uid.dat");
								if (local78 == 1 && (!local153.exists() || local153.length() < 4L)) {
									local167 = -1;
									@Pc(171) Random local171 = new Random();
									while (local167 == -1) {
										local167 = local171.nextInt();
									}
									@Pc(187) DataOutputStream local187 = new DataOutputStream(new FileOutputStream(local153));
									local187.writeInt(local167);
									local187.close();
								}
								if (local153.exists()) {
									local76 = true;
									@Pc(205) DataInputStream local205 = new DataInputStream(new FileInputStream(local153));
									this.anInt2970 = local205.readInt() + 1;
									local205.close();
								}
							} catch (@Pc(215) Exception local215) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local130 = new File(local130, arg0);
								if (local78 == 1 && !local130.exists()) {
									local141 = local130.mkdir();
									if (!local141) {
										continue;
									}
								}
								local153 = new File(local130, "main_file_cache.dat2");
								if (local78 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass82_2 = new Class82(local153, "rw", 52428800L);
								this.aClass82Array1 = new Class82[16];
								for (local167 = 0; local167 < 16; local167++) {
									this.aClass82Array1[local167] = new Class82(new File(local130, "main_file_cache.idx" + local167), "rw", 1048576L);
								}
								this.aClass82_1 = new Class82(new File(local130, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local130;
							} catch (@Pc(316) Exception local316) {
								try {
									this.aClass82_2.method2058();
									for (local167 = 0; local167 < 16; local167++) {
										this.aClass82Array1[local167].method2058();
									}
									this.aClass82_1.method2058();
								} catch (@Pc(345) Exception local345) {
								}
								this.aFile6 = this.aFile5 = null;
								this.aClass82_2 = this.aClass82_1 = null;
								this.aClass82Array1 = null;
							}
						}
					} catch (@Pc(362) Exception local362) {
					}
					if (local76 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!tc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class84 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean135) {
						return;
					}
					if (this.aClass84_3 != null) {
						local17 = this.aClass84_3;
						this.aClass84_3 = this.aClass84_3.aClass84_1;
						if (this.aClass84_3 == null) {
							this.aClass84_2 = null;
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
				@Pc(46) int local46 = local17.anInt2964;
				if (local46 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt2965);
				} else if (local46 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local17.anObject6);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local17.anInt2965);
					local17.anObject5 = local61;
				} else if (local46 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(97) Object[] local97;
					if (local46 == 8) {
						local97 = (Object[]) local17.anObject6;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local97[0]).getDeclaredMethod((String) local97[1], (Class[]) local97[2]);
					} else if (local46 == 9) {
						local97 = (Object[]) local17.anObject6;
						if (((Class) local97[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local97[0]).getDeclaredField((String) local97[1]);
					} else if (local46 == 3) {
						@Pc(173) String local173 = (local17.anInt2965 >> 24 & 0xFF) + "." + (local17.anInt2965 >> 16 & 0xFF) + "." + (local17.anInt2965 >> 8 & 0xFF) + "." + (local17.anInt2965 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local173).getHostName();
					}
				}
				local17.anInt2966 = 1;
			} catch (@Pc(223) ThreadDeath local223) {
				throw local223;
			} catch (@Pc(226) Throwable local226) {
				local17.anInt2966 = 2;
			}
		}
	}
}
