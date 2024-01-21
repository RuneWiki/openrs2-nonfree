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

@OriginalClass("loader!ba")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "loader!ba", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "loader!ba", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "loader!ba", name = "k", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ba", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!ba", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ba", name = "n", descriptor = "I")
	private static final int anInt3334 = 1;

	@OriginalMember(owner = "loader!ba", name = "h", descriptor = "Lloader!n;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ba", name = "i", descriptor = "[Lloader!bb;")
	private Class81[] aClass81Array1;

	@OriginalMember(owner = "loader!ba", name = "b", descriptor = "Lloader!eb;")
	private Class82 aClass82_1 = null;

	@OriginalMember(owner = "loader!ba", name = "c", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!ba", name = "a", descriptor = "Lloader!eb;")
	private Class82 aClass82_2 = null;

	@OriginalMember(owner = "loader!ba", name = "s", descriptor = "Lloader!bb;")
	private Class81 aClass81_1 = null;

	@OriginalMember(owner = "loader!ba", name = "l", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ba", name = "d", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "loader!ba", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ba", name = "e", descriptor = "Lloader!bb;")
	private Class81 aClass81_2 = null;

	@OriginalMember(owner = "loader!ba", name = "m", descriptor = "I")
	private int anInt3335 = 0;

	@OriginalMember(owner = "loader!ba", name = "t", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!ba", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ba", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class80(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		aString6 = "Unknown";
		this.anApplet2 = arg1;
		aString5 = "1.1";
		this.anInetAddress2 = arg2;
		try {
			aString6 = System.getProperty("java.vendor");
			aString5 = System.getProperty("java.version");
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
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(74) Throwable local74) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(101) Exception local101) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(129) Exception local129) {
		}
		this.method2195(arg3, arg5, arg4);
		this.aBoolean187 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ba", name = "a", descriptor = "(IIBLjava/lang/String;)V")
	private void method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(13) boolean local13 = false;
		@Pc(38) String[] local38 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(73) String[] local73 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString7, "" };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(90) int local90 = 0; local90 < local38.length; local90++) {
				for (@Pc(96) int local96 = 0; local96 < local73.length; local96++) {
					try {
						@Pc(104) String local104 = local73[local96];
						if (local104.length() > 0 && !(new File(local104)).exists()) {
							continue;
						}
						@Pc(130) File local130 = new File(local104 + local38[local90]);
						@Pc(139) boolean local139;
						if (local85 == 1 && !local130.exists()) {
							local139 = local130.mkdir();
							if (!local139) {
								continue;
							}
						}
						@Pc(167) int local167;
						@Pc(152) File local152;
						if (!local13) {
							try {
								local152 = new File(local130, "uid.dat");
								if (local85 == 1 && (!local152.exists() || local152.length() < 4L)) {
									local167 = -1;
									@Pc(171) Random local171 = new Random();
									while (local167 == -1) {
										local167 = local171.nextInt();
									}
									@Pc(186) DataOutputStream local186 = new DataOutputStream(new FileOutputStream(local152));
									local186.writeInt(local167);
									local186.close();
								}
								if (local152.exists()) {
									local13 = true;
									@Pc(205) DataInputStream local205 = new DataInputStream(new FileInputStream(local152));
									this.anInt3335 = local205.readInt() + 1;
									local205.close();
								}
							} catch (@Pc(215) Exception local215) {
							}
						}
						if (this.aFile4 == null) {
							try {
								local130 = new File(local130, arg2);
								if (local85 == 1 && !local130.exists()) {
									local139 = local130.mkdir();
									if (!local139) {
										continue;
									}
								}
								local152 = new File(local130, "main_file_cache.dat2");
								if (local85 == 0 && !local152.exists()) {
									continue;
								}
								this.aClass81_1 = new Class81(local152, "rw", 52428800L);
								this.aClass81Array1 = new Class81[16];
								for (local167 = 0; local167 < 16; local167++) {
									this.aClass81Array1[local167] = new Class81(new File(local130, "main_file_cache.idx" + local167), "rw", 1048576L);
								}
								this.aClass81_2 = new Class81(new File(local130, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local130;
							} catch (@Pc(317) Exception local317) {
								try {
									this.aClass81_1.method2205();
									for (local167 = 0; local167 < 16; local167++) {
										this.aClass81Array1[local167].method2205();
									}
									this.aClass81_2.method2205();
								} catch (@Pc(344) Exception local344) {
								}
								this.aClass81_1 = this.aClass81_2 = null;
								this.aClass81Array1 = null;
								this.aFile5 = this.aFile4 = null;
							}
						}
					} catch (@Pc(361) Exception local361) {
					}
					if (local13 && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!ba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class82 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean187) {
						return;
					}
					if (this.aClass82_2 != null) {
						local16 = this.aClass82_2;
						this.aClass82_2 = this.aClass82_2.aClass82_3;
						if (this.aClass82_2 == null) {
							this.aClass82_1 = null;
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
				@Pc(46) int local46 = local16.anInt3339;
				if (local46 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt3337);
				} else if (local46 == 2) {
					@Pc(204) Thread local204 = new Thread((Runnable) local16.anObject5);
					local204.setDaemon(true);
					local204.start();
					local204.setPriority(local16.anInt3337);
					local16.anObject6 = local204;
				} else if (local46 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(89) Object[] local89;
					if (local46 == 9) {
						local89 = (Object[]) local16.anObject5;
						if (((Class) local89[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local89[0]).getDeclaredMethod((String) local89[1], (Class[]) local89[2]);
					} else if (local46 == 10) {
						local89 = (Object[]) local16.anObject5;
						if (((Class) local89[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local89[0]).getDeclaredField((String) local89[1]);
					} else if (local46 == 3) {
						@Pc(191) String local191 = (local16.anInt3337 >> 24 & 0xFF) + "." + (local16.anInt3337 >> 16 & 0xFF) + "." + (local16.anInt3337 >> 8 & 0xFF) + "." + (local16.anInt3337 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local191).getHostName();
					}
				}
				local16.anInt3338 = 1;
			} catch (@Pc(221) Exception local221) {
				local16.anInt3338 = 2;
			}
		}
	}
}
