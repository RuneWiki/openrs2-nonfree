import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class320 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class320() throws Exception {
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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I)V")
	public void method8266() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method8268(null);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IBLjava/awt/Frame;III)V")
	public void method8267(@OriginalArg(0) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method8268(arg1);
		if (arg0 == 0) {
			@Pc(39) int local39 = this.aDisplayMode1.getRefreshRate();
			@Pc(43) DisplayMode[] local43 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(45) boolean local45 = false;
			for (@Pc(47) int local47 = 0; local47 < local43.length; local47++) {
				if (local43[local47].getWidth() == arg3 && arg4 == local43[local47].getHeight() && arg2 == local43[local47].getBitDepth()) {
					@Pc(79) int local79 = local43[local47].getRefreshRate();
					if (!local45 || Math.abs(local79 - local39) < Math.abs(arg0 - local39)) {
						arg0 = local79;
						local45 = true;
					}
				}
			}
			if (!local45) {
				arg0 = local39;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg4, arg2, arg0));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method8268(@OriginalArg(1) Frame arg0) {
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			;
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(B)[I")
	public int[] method8269() {
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
