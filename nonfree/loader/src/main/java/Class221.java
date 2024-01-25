import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
public final class Class221 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class221() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(31) GraphicsDevice local31 = local15[local19];
				if (local31 != null && local31.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local31;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5711(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local20) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(58) Field local58 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local58.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(65) Throwable local65) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(IIILjava/awt/Frame;IB)V")
	public void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Frame arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method5711(arg3);
		if (arg4 == 0) {
			@Pc(39) int local39 = this.aDisplayMode1.getRefreshRate();
			@Pc(43) DisplayMode[] local43 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(45) boolean local45 = false;
			for (@Pc(47) int local47 = 0; local47 < local43.length; local47++) {
				if (local43[local47].getWidth() == arg2 && arg0 == local43[local47].getHeight() && arg1 == local43[local47].getBitDepth()) {
					@Pc(74) int local74 = local43[local47].getRefreshRate();
					if (!local45 || Math.abs(local74 - local39) < Math.abs(arg4 - local39)) {
						arg4 = local74;
						local45 = true;
					}
				}
			}
			if (!local45) {
				arg4 = local39;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg0, arg1, arg4));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(I)V")
	public void method5713() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5711(null);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(B)[I")
	public int[] method5714() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}
}
